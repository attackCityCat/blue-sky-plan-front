package org.bs.front.pojo.order;

import java.io.Serializable;

/**
 * @author Lenovo
 * @title: OrderBean
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/179:02
 */
public class OrderBean implements Serializable {
    private static final long serialVersionUID = 6089302063749486319L;

    private Integer order_id;

    private String order_no;

    private String order_createTime;

    private Double order_countPrice;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_createTime() {
        return order_createTime;
    }

    public void setOrder_createTime(String order_createTime) {
        this.order_createTime = order_createTime;
    }

    public Double getOrder_countPrice() {
        return order_countPrice;
    }

    public void setOrder_countPrice(Double order_countPrice) {
        this.order_countPrice = order_countPrice;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "order_id=" + order_id +
                ", order_no='" + order_no + '\'' +
                ", order_createTime='" + order_createTime + '\'' +
                ", order_countPrice=" + order_countPrice +
                '}';
    }
}
