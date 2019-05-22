package org.bs.front.service;

import org.bs.front.pojo.shop.ImgBean;
import org.bs.front.pojo.shop.ShopBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 * @title: ShopServiceApi
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2114:10
 */
public interface ShopServiceApi {

    @RequestMapping(value = "queryImg")
    List<ImgBean> queryImg(@RequestParam(value = "id") Integer id);
}
