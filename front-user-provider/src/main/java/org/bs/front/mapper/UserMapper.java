package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface UserMapper {
/*
    @Select("select user_id as userId , phone , password , status ,email , create_time as createTime ," +
            "update_time as updateTime ,role_id as roleId ,que_ans_id as queAnsId , name , head_img as headImg " +
            "from front_user where phone =  #{value}")
    UserBean queryUserName(String phone);

    void saveUser(@RequestBody UserBean userBean);

    @Update("update  front_user  set password = #{password} where phone = #{phone} ")
    void editRetrieve(@RequestParam("phone") String phone, @RequestParam("password") String password);*/


  //  List<ProductBean> findShopList();
}
