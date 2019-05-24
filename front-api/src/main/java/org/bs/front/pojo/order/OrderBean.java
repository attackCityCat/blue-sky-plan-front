package org.bs.front.pojo.order;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Lenovo
 * @title: OrderBean
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/179:02
 */

public class OrderBean implements Serializable {
    private static final long serialVersionUID = 6089302063749486319L;

    private String orderId;//订单id

    private String orderNo;//订单编号

    private String orderCreateTime;//下单时间

    private Integer orderStatus;//订单状态

    private String orderPhone;//联系电话

    private String payManeyTime;//付款时间

    private String shouJianRen;//收件人

    private String orderCity;//收货地址

    private String orderMessage;//订单留言

    private String shopImg;//商品图片

    private String shopName;//商品名称

    private Double shopOnePrice;//商品单价

    private Integer shopCount;//商品数量

    private String shopCountPrice;//商品总价

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getPayManeyTime() {
        return payManeyTime;
    }

    public void setPayManeyTime(String payManeyTime) {
        this.payManeyTime = payManeyTime;
    }

    public String getShouJianRen() {
        return shouJianRen;
    }

    public void setShouJianRen(String shouJianRen) {
        this.shouJianRen = shouJianRen;
    }

    public String getOrderCity() {
        return orderCity;
    }

    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Double getShopOnePrice() {
        return shopOnePrice;
    }

    public void setShopOnePrice(Double shopOnePrice) {
        this.shopOnePrice = shopOnePrice;
    }

    public Integer getShopCount() {
        return shopCount;
    }

    public void setShopCount(Integer shopCount) {
        this.shopCount = shopCount;
    }

    public String getShopCountPrice() {
        return shopCountPrice;
    }

    public void setShopCountPrice(String shopCountPrice) {
        this.shopCountPrice = shopCountPrice;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "orderId='" + orderId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderCreateTime='" + orderCreateTime + '\'' +
                ", orderStatus=" + orderStatus +
                ", orderPhone='" + orderPhone + '\'' +
                ", payManeyTime='" + payManeyTime + '\'' +
                ", shouJianRen='" + shouJianRen + '\'' +
                ", orderCity='" + orderCity + '\'' +
                ", orderMessage='" + orderMessage + '\'' +
                ", shopImg='" + shopImg + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopOnePrice=" + shopOnePrice +
                ", shopCount=" + shopCount +
                ", shopCountPrice='" + shopCountPrice + '\'' +
                '}';
    }
}
