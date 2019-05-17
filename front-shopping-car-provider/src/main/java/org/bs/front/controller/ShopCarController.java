package org.bs.front.controller;

import org.bs.front.mapper.ShopCarMapper;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class ShopCarController {

    @Autowired
    ShopCarMapper shopCarMapper;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @RequestMapping(value = "test1")
    public String test(@RequestParam(value = "name") String name){

        Boolean hasKey = redisTemplate.hasKey("hashValue");
        //存入一个map
        //第一个值为购物车的K 第二个为物品的K 第三个为商品信息
    /*    redisTemplate.opsForHash().put("hashValue","map1",name);
        redisTemplate.opsForHash().put("hashValue","map2",name);
        redisTemplate.opsForHash().put("hashValue","map3",name);
        redisTemplate.opsForHash().put("hashValue","map4",name);
        redisTemplate.opsForHash().put("hashValue","map5",name);*/
        //如果想要删除或者是用户已购买时，移除购物车 根据购物的K和物品的K 删除，多个时可以一个购物车K多个商品K
        //redisTemplate.opsForHash().delete("hashValue","map1","map2");
        UserBean bean = new UserBean();

        bean.setUserId(1);
        bean.setName("案说法");
        redisTemplate.opsForHash().put("hashValue","map4",bean);
        //取指定key的值
        Object o = redisTemplate.opsForHash().get("hashValue", "map4");
        UserBean bean1 = (UserBean)o;
        System.out.println(bean1);



        System.out.println(o);
        if(hasKey){

            return "黑蛋收到";
        }else {
            return "redis里好像没有啊";
        }

    }
    /**
     * 查询购物车商品
     * @return
     */
    @GetMapping(value = "queryShopCar")
   public List<ProductBean> queryShopCar(){

        return shopCarMapper.queryShopCar();
    }

    @RequestMapping(value = "updateCountPuls")
    public void updateCountPuls(@RequestParam(value = "id") Integer id){
        shopCarMapper.updateCountPuls(id);
    }
    @RequestMapping(value = "updateCountReduce")
    public void updateCountReduce(@RequestParam(value = "id") Integer id){
        shopCarMapper.updateCountReduce(id);
    }
    @RequestMapping(value = "delShopCar")
    public void delShopCar(@RequestParam(value = "id") Integer id){
        shopCarMapper.delShopCar(id);
    }

}
