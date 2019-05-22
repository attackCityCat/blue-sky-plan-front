package org.bs.front.pojo.showproduct;

import java.io.Serializable;

public class ColorBean implements Serializable {
    private static final long serialVersionUID = 7297588047970886827L;

    //颜色实体
    private Integer id;

    private String color_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }
}
