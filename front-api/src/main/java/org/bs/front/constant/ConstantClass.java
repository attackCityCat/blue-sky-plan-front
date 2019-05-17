package org.bs.front.constant;

public class ConstantClass {
    /**
     * 这是一个常量类
     */

    //查询用户购物车时的Key，用此key+用户id
    public static final String FIND_USER_SHOP_CAR = "findUserShopCar";

    //商品存入缓存时的key，用此key+商品id, 对应删除时也要用到此Key 这个Key+商品id
    public static final String SHOP_KEY = "shopKey";
}
