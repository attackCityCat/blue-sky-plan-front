package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.bs.front.pojo.order.OrderBean;

import java.util.List;

/**
 * @author Lenovo
 * @title: OrderMapper
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/1710:30
 */
public interface OrderMapper {
    void addOrder(OrderBean orderBean);

    @Select("select * from cms_order")
    List<OrderBean> queryOrder();
}
