package org.bs.front.rabbitMQconf;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Lenovo
 * @title: setMsg
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2314:40
 */
@Controller
public class setMsg {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @RequestMapping("setMsg")
    @ResponseBody
    public  String setMsg(){
        rabbitTemplate.convertAndSend("orderNo","发一个队列实施");

        return "成功";
    }
}
