package org.bs.front.controller;

import org.bs.front.mapper.ShopCarMapper;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ShopCarController {

    @Autowired
    ShopCarMapper shopCarMapper;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

/*    @RequestMapping(value = "test1")
    public String test(@RequestParam(value = "name") String name){

        Boolean hasKey = redisTemplate.hasKey("hashValue");
        //存入一个map
        //第一个值为购物车的K 第二个为物品的K 第三个为商品信息
    *//*    redisTemplate.opsForHash().put("hashValue","map1",name);
        redisTemplate.opsForHash().put("hashValue","map2",name);
        redisTemplate.opsForHash().put("hashValue","map3",name);
        redisTemplate.opsForHash().put("hashValue","map4",name);
        redisTemplate.opsForHash().put("hashValue","map5",name);*//*
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

    }*/
    /**
     * 查询购物车商品
     * @return
     */
    @GetMapping(value = "queryShopCar")
   public List<ProductBean> queryShopCar(@RequestParam(value = "key") String key){


        ProductBean bean = new ProductBean();
        bean.setProductId(11);
        bean.setProductColor("蓝色");
        bean.setProductImg("111111");
        bean.setProductName("内衣");
        bean.setProductCount(1);
        bean.setProductPrice(5.1f);
        bean.setProductSpec("xxxxx");
        ProductBean bean1 = new ProductBean();
        bean1.setProductId(12);
        bean1.setProductColor("蓝色");
        bean1.setProductImg("111111");
        bean1.setProductName("内衣");
        bean1.setProductCount(1);
        bean1.setProductPrice(5.1f);
        bean1.setProductSpec("xxxxx");

        redisTemplate.opsForHash().put(key,"map1",bean);
        redisTemplate.opsForHash().put(key,"map2",bean1);
        //查看对应Key中的所有数据展示
        Map<Object, Object> map = redisTemplate.opsForHash().entries(key);

        System.out.println(map);
        //将 缓存中的map转换成list数据 返回展示  强转
        List<ProductBean>  list = (List) map.values().stream().collect(Collectors.toList());
        System.out.println(list);

        return list;
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
