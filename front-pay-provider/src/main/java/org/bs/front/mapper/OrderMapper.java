package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.bs.front.pojo.city.CityBean;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.shop.ShopBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lenovo
 * @title: OrderMapper
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/1710:30
 */
public interface OrderMapper {

    @Select("select * from cms_order")
    List<OrderBean> queryOrder();

    //查询用户
    @Select("select * from front_user where user_id = #{value}")
    UserBean queryUserById(@RequestParam(value = "userId") Integer userId);

    //查询城市
    @Select("select * from front_city where id = #{value}")
    CityBean queryCity(@RequestParam(value = "cityId") Integer cityId);

    //查询商品
    @Select("select " +
            " cp.*," +
            " ci.url imgUrl" +
            " from cms_product cp left join cms_product_img ci " +
            " on cp.product_id = ci.product_id " +
            "where cp.product_id = #{value}")
    ShopBean queryShopById(@RequestParam(value = "shopId") Integer shopId);
}
