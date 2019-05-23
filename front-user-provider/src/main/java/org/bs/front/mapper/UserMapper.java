package org.bs.front.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bs.front.pojo.showproduct.ColorBean;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.showproduct.SizeBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public interface UserMapper {

    @Select("select user_id as userId , phone , password , status ,email , create_time as createTime ," +
            "update_time as updateTime ,role_id as roleId ,que_ans_id as queAnsId , name , head_img as headImg " +
            "from front_user where phone =  #{value}")
    UserBean queryUserName(String phone);

    void saveUser(@RequestBody UserBean userBean);

    @Update("update  front_user  set password = #{password} where phone = #{phone} ")
    void editRetrieve(@RequestParam("phone") String phone, @RequestParam("password") String password);


    //查询女装
   List<ProductBean> findShopList();
   //查询男装
   List<ProductBean> findShopListMen();

   //查询商品详情
    ProductBean queryShopDetails(Integer id);

    @Select(" select cpi.url from cms_product cp  " +
            " left join cms_product_img cpi  on cp.product_id = cpi.product_id " +
            " where cp.product_id = #{value} ")
    List<String> queryShopImg(Integer id);

    //查询销量最高的4条数据
    List<ProductBean> topSelling();

    /**
     * 获取规格列表
     * @return
     */
    @Select("select id,size_name as sizeName from cms_size")
    List<SizeBean> findSizeList();

    @Select("select id,color_name as colorName from cms_product_color")
    List<ColorBean> findColorList();

    @Select("select " +
            "cp.product_id as id, " +
            "cp.product_stock as productStock " +
            "from cms_product cp " +
            "left join cms_size cs on cp.size_id = cs.id " +
            "left join cms_product_color cpc on cp.color_id = cpc.id " +
            "where cp.product_title = #{title} " +
            "and cp.size_id = #{sizeId} " +
            "and cp.color_id = #{colorId}")
    ProductBean findStore(@Param("title") String title,@Param("colorId") Integer colorId,@Param("sizeId") Integer sizeId);
}
