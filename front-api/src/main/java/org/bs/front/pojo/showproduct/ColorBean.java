package org.bs.front.pojo.showproduct;

import java.io.Serializable;

public class ColorBean implements Serializable {
    private static final long serialVersionUID = 7297588047970886827L;

    //颜色实体
    private Integer id;

    private String colorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
