package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.CityBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;


public interface UserMapper {

    @Select("select u.user_id as userId , u.phone as phone , u.password as password , u.status as status ,u.email as email , u.create_time as createTime , " +
            " u.update_time as updateTime ,r.role_name as roleName, u.que_ans_id as queAnsId , name , u.head_img as headImg  " +
            " from front_user u " +
            " left  join  front_role r  on  r.role_id = u.role_id " +
            " where phone = #{value}")
    UserBean queryUserName(String phone);

    void saveUser(UserBean userBean);

    @Update("update  front_user  set password = #{password} where phone = #{phone} ")
    void editRetrieve(@RequestParam("phone") String phone, @RequestParam("password") String password);

    @Update("update  front_user  set password = #{password}, update_time = sysdate() where user_Id = #{id}")
    void editPassword(@RequestParam("id")Integer id, @RequestParam("password") String password);

    void editUserFrom(@RequestBody UserBean userBean);

    @Select("select  cp.product_id as id , cp.product_title as productTitle , cp.product_state, cp.product_price as productPrice ,  " +
            "  cp.product_stock as productStock , cp.shelf_time as shelfTime, cp.product_sales as productSales ,  " +
            "  cpI.url as url , ct.type_name as typeName from   cms_product cp  " +
            "  left  join cms_product_img cpI on cpI.product_id  = cp.product_id  " +
            "  left  join cms_type ct on  ct.id = cp.type_id  where cp.product_state = 0")
    List<ProductBean> queryProduct();

    @Select(" select * from front_city where pid = #{value}")
    List<CityBean> queryProvince(Integer id);
}
