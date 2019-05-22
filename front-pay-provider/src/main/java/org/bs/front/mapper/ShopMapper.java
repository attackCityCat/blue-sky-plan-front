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
    @Select("select * from cms_product_img where product_id = #{value}")
    List<ImgBean> queryImg(Integer id);
}
