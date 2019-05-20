package org.bs.front.service;

import org.bs.front.service.user.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

//总会找不到 所以加了个地址
@FeignClient(value = "front-user-consumer")
public interface UserService extends UserServiceApi {

}
