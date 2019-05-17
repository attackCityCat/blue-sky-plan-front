package org.bs.front.service;


import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Lenovo
 * @title: OrderService
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/1716:41
 */
@FeignClient(value = "front-pay-provider")
public interface OrderService extends OrderServiceApi {
}
