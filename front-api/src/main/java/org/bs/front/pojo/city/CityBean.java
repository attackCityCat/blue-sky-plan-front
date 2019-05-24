package org.bs.front.pojo.city;

import java.io.Serializable;

/**
 * @author Lenovo
 * @title: CityBean
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2410:52
 */
public class CityBean implements Serializable {
    private static final long serialVersionUID = -3145385781438910943L;

    private Integer id;

    private String name;

    private String code;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
