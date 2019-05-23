package org.bs.front.rabbitMQconf;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lenovo
 * @title: RabbitMQConf
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2314:20
 */
@Configuration
public class RabbitMQConf {

    @Bean
    public Queue queue() {
        //true代表是否持久化
        return new Queue("orderNo", true);
    }
}
