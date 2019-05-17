package org.bs.front.pojo.product;

import java.io.Serializable;


public class ProductBean implements Serializable {

    private static final long serialVersionUID = 6297828463540143099L;

    private Integer productId;      //商品id

    private String productName;      //商品名

    private String productImg;        //商品图

    private String productSpec;     //商品规格

    private String productColor;    //商品颜色

    private Float productPrice;   //商品价格

    private Integer productCount;   //商品数量

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productImg='" + productImg + '\'' +
                ", productSpec='" + productSpec + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productPrice=" + productPrice +
                ", productCount=" + productCount +
                '}';
    }
}
