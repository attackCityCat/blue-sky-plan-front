package org.bs.front.controller.order;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.bs.front.constant.ConstantClass;
import org.bs.front.mapper.OrderMapper;
import org.bs.front.pojo.city.CityBean;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.shop.ShopBean;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.utils.RequestUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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


    //查询用户
    @RequestMapping(value = "/queryUserById")
    @ResponseBody
    public UserBean queryUserById(@RequestParam(value = "userId") Integer userId){
        return orderMapper.queryUserById(userId);
    }

    //查询城市
    @RequestMapping(value = "/queryCity")
    @ResponseBody
    public CityBean queryCity(@RequestParam(value = "cityId") Integer cityId){
        return orderMapper.queryCity(cityId);
    }

    //查询商品
    @RequestMapping(value = "/queryShopById")
    @ResponseBody
    public ShopBean queryShopById(@RequestParam(value = "shopId") Integer shopId){
        return orderMapper.queryShopById(shopId);
    }

    @RequestMapping(value = "/queryOrder")
    @ResponseBody
    public List<OrderBean> queryOrder() {
        return orderMapper.queryOrder();
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
