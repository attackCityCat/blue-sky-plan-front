package org.bs.front.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopCarMapper {

    /***
     * 测试查询
     * 用户登陆 弄好以后要根据用户id去查用户对应的购物车数据
     * 用户购物车涉及到中间用户与用户购物车的中间表
     * 付款时选中账户余额付款还是支付宝付款等信息
     * @return
     */
    @Select(" select * from t_product ")
    List<ProductBean> queryShopCar();

    @Update(" update t_product set productCount = productCount+1 where productId=#{value}")
    void updateCountPuls(Integer id);

    @Update(" update t_product set productCount = productCount-1 where productId=#{value}")
    void updateCountReduce(Integer id);

    @Delete(" delete from  t_product where productId=#{value} ")
    void delShopCar(Integer id);
}
