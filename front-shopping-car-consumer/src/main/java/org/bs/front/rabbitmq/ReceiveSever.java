package org.bs.front.rabbitmq;

import com.alibaba.fastjson.JSON;
import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.product.EditPriceBean;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.Set;

@Component
@RabbitListener(queues = "EditShop")//监听队列 属性值为队列的名字
public class ReceiveSever {
    @Resource
    RedisTemplate<String, Object> redisTemplate;

    /**
     * 监控队列 如果发现有商品价格改动则 改动所有用户车的商品价格
     *
     * @param msg
     */
    @RabbitHandler
    public void getMsg(String msg) {
        //发送的队列传的值为string所以用一个string接收    {"productId":40,"productPrice":123}
        //且Rabbitmq传送的值都是string
        System.out.println("我是消费者，我接收到了传递过来的数据为“" + msg + "”");

        //将接收到的数据转成实体类
        EditPriceBean editPriceBean = JSON.parseObject(msg, EditPriceBean.class);
        //通过用户key模糊匹配获取到所有用户的key
        Set<String> keys = redisTemplate.keys(ConstantClass.FIND_USER_SHOP_CAR + "*");
        System.out.println(keys);
        //迭代器迭代获取到的key
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            //通过用户Key和商品key+商品id 获取到指定商品
            ProductBean productBean = (ProductBean) redisTemplate.opsForHash().get(key, ConstantClass.SHOP_KEY + editPriceBean.getProductId());
            //判断为空时跳过
            if (productBean == null) {
                continue;
            }
            //将不为空的数据重新存到redis
            productBean.setProductPrice(editPriceBean.getProductPrice());
            redisTemplate.opsForHash().put(key, ConstantClass.SHOP_KEY + editPriceBean.getProductId(), productBean);
        }
    }
}
