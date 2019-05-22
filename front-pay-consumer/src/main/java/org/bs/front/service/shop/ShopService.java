package org.bs.front.service.shop;

import org.bs.front.service.ShopServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Lenovo
 * @title: ShopService
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2114:05
 */
@FeignClient(value = "front-pay-provider")
public interface ShopService extends ShopServiceApi {
}
