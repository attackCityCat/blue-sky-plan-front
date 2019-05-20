package org.bs.front.mapper;

import org.apache.ibatis.annotations.Select;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.RequestBody;


public interface UserMapper {

    @Select("select user_id as userId , phone , password , status ,email , create_time as createTime ," +
            "update_time as updateTime ,role_id as roleId ,que_ans_id as queAnsId , name , head_img as headImg " +
            "from front_user where phone =  #{value}")
    UserBean queryUserName(String phone);

    void saveUser(@RequestBody UserBean userBean);
}
