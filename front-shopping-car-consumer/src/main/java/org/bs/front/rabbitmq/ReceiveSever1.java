package org.bs.front.rabbitmq;

import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.Set;

@Component
@RabbitListener(queues = "delShop")//监听队列 属性值为队列的名字
public class ReceiveSever1 {

    @Resource
    RedisTemplate<String, Object> redisTemplate;

    /**
     * 将下架的商品从购物车删除
     * @param msg
     */
    @RabbitHandler
    public void getMsg(String msg) {
        System.out.println("我是消费者，我接收到了传递过来的数据为“" + msg + "”");

        //获取所有key
        Set<String> keys = redisTemplate.keys(ConstantClass.FIND_USER_SHOP_CAR + "*");
        System.out.println(keys);
        //迭代器迭代获取到的key
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            //删除 所有用户中对应的商品
            redisTemplate.opsForHash().delete(key, ConstantClass.SHOP_KEY + msg);
        }
    }
}
