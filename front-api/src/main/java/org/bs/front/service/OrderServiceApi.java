package org.bs.front.service;

import com.alipay.api.AlipayApiException;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    void addOrder(@RequestBody OrderBean orderBean
            ,@RequestParam(value = "price") Double price);

    @RequestMapping(value = "queryOrder")
    List<OrderBean> queryOrder();

    @RequestMapping(value = "cashier")
    List<ProductBean> queryShopCar(@RequestParam(value = "userKey") String userKey, @RequestParam(value = "ids") int[] ids);
}
