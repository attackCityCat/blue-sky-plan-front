package org.bs.front.service;

import com.alipay.api.AlipayApiException;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Lenovo
 * @title: OrderServiceApi
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/1716:35
 */
public interface OrderServiceApi {

    @RequestMapping(value = "addOrder")
    void addOrder(@RequestBody OrderBean orderBean);

    @RequestMapping(value = "queryOrder")
    List<OrderBean> queryOrder();

    @RequestMapping(value = "goAlipay")
    String goAlipay(@RequestParam(value = "request") HttpServletRequest request, @RequestParam(value = "response") HttpServletRequest response, @RequestParam(value="price") String price);

    @RequestMapping(value = "cashier")
    List<ProductBean> queryShopCar(@RequestParam(value = "userKey") String userKey, @RequestParam(value = "ids") int[] ids);
}
