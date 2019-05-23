package org.bs.front.controller.order;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.bs.front.conf.AlipayConfig;
import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.service.order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Lenovo
 * @title: OrderController
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/1710:28
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;

    /**
     * 进入收银台  进入收银台就先去查 要下单的商品 根据用的key+用户id并且根据传过来的ids 去查
     * @param model  前台展示的数据
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "cashier")
    private String queryShopCar(Model model,Double totalPrice,int[] ids,HttpSession session) throws IOException {


        //下面Key的userId上线时用 这个从session中获取的id 此时再测试 暂时写死
        /*UserBean userBean = (UserBean) session.getAttribute(session.getId());

        Integer userId = userBean.getUserId();*/

        //根据用户的key去redis中查询对应的值
        String userKey = ConstantClass.FIND_USER_SHOP_CAR+"userId";


        //上数据库查询这个用户的商品
        List<ProductBean> list = orderService.queryShopCar(userKey,ids);

        String id = "";
        for (int i = 0;i<ids.length; i++){
            id += ","+ids[i];
        }
        String s = id.substring(1);

        model.addAttribute("ids",s);
        System.out.println(s);

        model.addAttribute("totalPrice",totalPrice);
        System.out.println(totalPrice);

        model.addAttribute("list", list);

        return "view/cashier";
    }


    @RequestMapping(value = "/goAlipay", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String goAlipay(HttpServletRequest request, HttpServletRequest response, Double price) {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id,
                AlipayConfig.merchant_private_key,
                "json",
                AlipayConfig.charset,
                AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);


        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = UUID.randomUUID().toString();
        //付款金额，必填
        String total_amount = price.toString();
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
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/queryOrder")
    public String queryOrder(Model model){
        List<OrderBean> orderBeans = orderService.queryOrder();
        model.addAttribute("list",orderBeans);
        return "view/order";
    }

    //生产订单
    @RequestMapping(value = "/addOrder")
    @ResponseBody
    public void addOrder(String ids,Double price){

            //等待把活数据传过来，先用死数据
            /*SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmss");
            String format = sim.format(new Date());
            OrderBean orderBean = new OrderBean();
            orderBean.setOrder_no(""+(System.currentTimeMillis() / 1000));//订单号
            orderBean.setOrder_countPrice(price);//总价
            orderBean.setOrder_createTime(format);//下单时间
            orderService.addOrder(orderBean,price);*/

    }

}
