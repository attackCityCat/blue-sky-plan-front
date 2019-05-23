package org.bs.front.controller.order;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 * @title: OrderNoCreate
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2314:27
 */
@Component
@RabbitListener(queues = "orderNo")
public class OrderNoCreate {

    @RabbitHandler
    public void getMsg(String msg){
        System.out.println(msg);
    }
}
