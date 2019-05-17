package org.bs.front.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "front-shopping-car-provider")
public interface ShopCarService extends ShopCarServiceApi{

}
