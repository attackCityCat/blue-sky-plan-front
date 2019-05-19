package org.bs.front.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.bs.front.conf.AlipayConfig;
import org.bs.front.constant.ConstantClass;
import org.bs.front.mapper.OrderMapper;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Lenovo
 * @title: OrderServiceImpl
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/1710:29
 */
@Controller
public class OrderController {

    @Resource
    OrderMapper orderMapper;

    @Resource
    RedisTemplate<String,Object> redisTemplate;



    @RequestMapping(value = "/addOrder")
    @ResponseBody
    public void addOrder(@RequestBody OrderBean orderBean) {

        orderMapper.addOrder(orderBean);
    }

    @RequestMapping(value = "/queryOrder")
    @ResponseBody
    public List<OrderBean> queryOrder() {
        return orderMapper.queryOrder();
    }

    @RequestMapping(value = "/goAlipay")
    public String goAlipay(@RequestParam(value = "request") HttpServletRequest request, @RequestParam(value = "response")  HttpServletRequest response,@RequestParam(value = "price") String price) {

        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);


        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = UUID.randomUUID().toString();
        //付款金额，必填
        String total_amount = price;
        //订单名称，必填
        String subject = "2016092900625986";
        //商品描述，可空
        String body = "";

        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        String timeout_express = "1c";

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"timeout_express\":\""+ timeout_express +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //请求
        String result = null;
        try {
            result = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        System.out.println("返回页面"+ result);
        return result;
    }


    /**
     * 查询 用户要结算的商品
     * @param userKey  当前登陆的用户Key
     * @param ids       商品的id，可能会是多个多一用数值接收
     * @return
     */
    @RequestMapping(value = "cashier")
    @ResponseBody
    public List<ProductBean> queryShopCar(@RequestParam(value = "userKey") String userKey, @RequestParam(value = "ids") int[] ids){

        //定义一个商品的K
        String ShopKey = ConstantClass.SHOP_KEY;

        //new 一个list
        ArrayList<ProductBean> list = new ArrayList<>();

        //遍历数组
        for(int i = 0;i<ids.length;i++){

            String key = ShopKey + ids[i];

            //挨个查询并存入list
            ProductBean pro = (ProductBean) redisTemplate.opsForHash().get(userKey,key);

            list.add(pro);
        }

        System.out.println(list);
        return list;
    }
}
