package org.bs.front.pojo.product;

import java.io.Serializable;
import java.util.Date;

public class ProductBean implements Serializable {
    private static final long serialVersionUID = 6297828463540143099L;

    private Integer productId;

    private String productName;

    private Double productPrice;

    private Date createDate;
}
