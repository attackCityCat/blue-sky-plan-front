package org.bs.front.controller;

import org.bs.front.constant.ConstantClass;
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

    @Resource
    private RedisTemplate<String, Object> redisTemplate;


    /**
     * 查询购物车商品
     *
     * @return
     */
    @GetMapping(value = "queryShopCar")
    public List<ProductBean> queryShopCar(@RequestParam(value = "key") String key) {

//        查看对应Key中的所有数据展示
        Map<Object, Object> map = redisTemplate.opsForHash().entries(key);

        //将 缓存中的map转换成list数据 返回展示  强转
        List<ProductBean> list = (List) map.values().stream().collect(Collectors.toList());
        System.out.println(list);

        return list;
    }

    /**
     * 删除指定 商品
     *
     * @param userKey //当前登陆人的购物车
     * @param shopKey //当前登陆人的购物车里对应商品的key
     * @return
     */
    @RequestMapping(value = "delShopCar")
    public boolean delShopCar(@RequestParam(value = "userKey") String userKey, @RequestParam(value = "shopKey") String shopKey) {

        try {
            redisTemplate.opsForHash().delete(userKey, shopKey);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 模拟用户添加商品到购物车
     * 正式启动时需要传递商品参数的实体过来
     * 
     */
    @RequestMapping("addShopCar")
    public void addShopCar() {
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
        String key = ConstantClass.FIND_USER_SHOP_CAR+"userId";
        redisTemplate.opsForHash().put(key, ConstantClass.SHOP_KEY + bean.getProductId(), bean);
        redisTemplate.opsForHash().put(key, ConstantClass.SHOP_KEY + bean1.getProductId(), bean1);

    }


}
