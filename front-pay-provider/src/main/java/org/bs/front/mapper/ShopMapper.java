package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.bs.front.pojo.shop.ImgBean;

import java.util.List;

/**
 * @author Lenovo
 * @title: ShopMapper
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2213:05
 */
public interface ShopMapper {
    List<ImgBean> queryImg(String[] ids);
}
