package org.bs.front.pojo.shop;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Lenovo
 * @title: ShopBean
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2111:34
 */
public class ShopBean implements Serializable {

    private static final long serialVersionUID = -4331933483177014053L;

    private String product_id; //主键ID

    private String product_title; //商品标题

    private Double product_price; //商品价格
    private Integer product_stock; //库存
    private Date product_time; //添加商品时间
    private Integer product_sales; //销量
    private Integer product_comments; //累计评论
    private Integer product_concern; //累计关注

    private Integer brand_id; //品牌ID
    private String brand_name;

    private Integer type_id; //类型ID
    private String type_name;

    private Integer size_id; //尺寸ID
    private String size_name;

    private Integer product_state; //是否上下架  0 为上架  1为未上架  默认为1

    private Integer color_id; //颜色 1玫瑰红 2方块蓝 3 黑色魔术熊 4白色彩灯熊 5可爱笑脸黄色 6芒果橙色 7原谅绿
    private String color_name;

    private Date shelf_time; //商品上架时间
    private Integer product_audit; //审核状态   0 为审核  1 为未审核  默认为1 2为审核中 3为审核未通过
    private Integer product_selling; //热卖设置   0为热卖  1为未热卖 默认为1

    private Integer store_id; //店铺ID
    private String store_name;

    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }



    public Integer getProduct_sales() {
        return product_sales;
    }

    public void setProduct_sales(Integer product_sales) {
        this.product_sales = product_sales;
    }

    public Integer getProduct_comments() {
        return product_comments;
    }

    public void setProduct_comments(Integer product_comments) {
        this.product_comments = product_comments;
    }

    public Integer getProduct_concern() {
        return product_concern;
    }

    public void setProduct_concern(Integer product_concern) {
        this.product_concern = product_concern;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getSize_id() {
        return size_id;
    }

    public void setSize_id(Integer size_id) {
        this.size_id = size_id;
    }

    public String getSize_name() {
        return size_name;
    }

    public void setSize_name(String size_name) {
        this.size_name = size_name;
    }

    public Integer getProduct_state() {
        return product_state;
    }

    public void setProduct_state(Integer product_state) {
        this.product_state = product_state;
    }

    public Integer getColor_id() {
        return color_id;
    }

    public void setColor_id(Integer color_id) {
        this.color_id = color_id;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public Date getProduct_time() {
        return product_time;
    }

    public void setProduct_time(Date product_time) {
        this.product_time = product_time;
    }

    public Date getShelf_time() {
        return shelf_time;
    }

    public void setShelf_time(Date shelf_time) {
        this.shelf_time = shelf_time;
    }

    public Integer getProduct_audit() {
        return product_audit;
    }

    public void setProduct_audit(Integer product_audit) {
        this.product_audit = product_audit;
    }

    public Integer getProduct_selling() {
        return product_selling;
    }

    public void setProduct_selling(Integer product_selling) {
        this.product_selling = product_selling;
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    @Override
    public String toString() {
        return "ShopBean{" +
                "product_id='" + product_id + '\'' +
                ", product_title='" + product_title + '\'' +
                ", product_price=" + product_price +
                ", product_stock=" + product_stock +
                ", product_time=" + product_time +
                ", product_sales=" + product_sales +
                ", product_comments=" + product_comments +
                ", product_concern=" + product_concern +
                ", brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", type_id=" + type_id +
                ", type_name='" + type_name + '\'' +
                ", size_id=" + size_id +
                ", size_name='" + size_name + '\'' +
                ", product_state=" + product_state +
                ", color_id=" + color_id +
                ", color_name='" + color_name + '\'' +
                ", shelf_time=" + shelf_time +
                ", product_audit=" + product_audit +
                ", product_selling=" + product_selling +
                ", store_id=" + store_id +
                ", store_name='" + store_name + '\'' +
                '}';
    }
}
