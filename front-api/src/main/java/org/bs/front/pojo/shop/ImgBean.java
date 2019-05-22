package org.bs.front.pojo.shop;

import java.io.Serializable;

/**
 * @author Lenovo
 * @title: ImgBean
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2213:08
 */
public class ImgBean implements Serializable {

    private static final long serialVersionUID = -4424907932911121736L;

    private Integer id;

    private String url;

    private Integer product_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}
