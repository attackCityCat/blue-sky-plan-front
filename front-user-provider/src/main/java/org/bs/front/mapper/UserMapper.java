package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.showproduct.TypeBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


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

    //查询男装类型
    @Select(" SELECT c.type_name FROM cms_type t " +
            "left join cms_type c on c.pid=t.id where c.pid =1 limit 0,15")
    List<TypeBean> findShopTypeManList();
    //查询女装类型
    @Select(" SELECT c.type_name FROM cms_type t " +
            "left join cms_type c on c.pid=t.id where c.pid =2 limit 0,15")
    List<TypeBean> findShopTypeList();
}
