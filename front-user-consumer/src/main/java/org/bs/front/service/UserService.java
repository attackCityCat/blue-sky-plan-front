package org.bs.front.service;

import org.bs.front.service.user.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value = "front-user-provider")
public interface UserService extends UserServiceApi {

}
