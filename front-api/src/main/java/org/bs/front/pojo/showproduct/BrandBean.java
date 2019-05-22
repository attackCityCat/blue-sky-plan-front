package org.bs.front.pojo.showproduct;

import java.io.Serializable;

public class BrandBean implements Serializable {
    //品牌实体
    private static final long serialVersionUID = -6281765248315540987L;

    private Integer id;

    private String brand_name;

    private String brandLogo;

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
}
