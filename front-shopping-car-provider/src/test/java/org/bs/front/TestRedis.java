package org.bs.front;

import org.bs.front.constant.ConstantClass;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.Set;

public class TestRedis {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Test
    public void testKeys(){
        Set<String> keys = redisTemplate.keys(ConstantClass.FIND_USER_SHOP_CAR+"*");
        System.out.println(keys);
    }
}
