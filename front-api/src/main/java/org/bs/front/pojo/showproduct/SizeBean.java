package org.bs.front.pojo.showproduct;

import java.io.Serializable;

public class SizeBean implements Serializable {
    private static final long serialVersionUID = -418077265756581798L;

    //尺寸表
    private Integer id;

    private String sizeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
}
