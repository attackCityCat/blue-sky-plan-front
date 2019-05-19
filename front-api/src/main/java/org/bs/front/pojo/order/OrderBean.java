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

    private String order_shop;

    private String order_name;

    private Integer order_type;

    private String order_createTime;

    private Double order_onePrice;

    private Double order_countPrice;

    private Integer order_num;

    private Integer order_city;

    private Integer order_status;

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

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

    public String getOrder_shop() {
        return order_shop;
    }

    public void setOrder_shop(String order_shop) {
        this.order_shop = order_shop;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public String getOrder_createTime() {
        return order_createTime;
    }

    public void setOrder_createTime(String order_createTime) {
        this.order_createTime = order_createTime;
    }

    public Double getOrder_onePrice() {
        return order_onePrice;
    }

    public void setOrder_onePrice(Double order_onePrice) {
        this.order_onePrice = order_onePrice;
    }

    public Double getOrder_countPrice() {
        return order_countPrice;
    }

    public void setOrder_countPrice(Double order_countPrice) {
        this.order_countPrice = order_countPrice;
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public Integer getOrder_city() {
        return order_city;
    }

    public void setOrder_city(Integer order_city) {
        this.order_city = order_city;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "order_id=" + order_id +
                ", order_no='" + order_no + '\'' +
                ", order_shop='" + order_shop + '\'' +
                ", order_name='" + order_name + '\'' +
                ", order_type=" + order_type +
                ", order_createTime='" + order_createTime + '\'' +
                ", order_onePrice=" + order_onePrice +
                ", order_countPrice=" + order_countPrice +
                ", order_num=" + order_num +
                ", order_city=" + order_city +
                '}';
    }
}
