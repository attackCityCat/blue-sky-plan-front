package org.bs.front.controller.order;

import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Lenovo
 * @title: OrderController
 * @projectName workspace_poi
 * @description: TODO
 * @date 2019/5/1710:28
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;





    /**
     * 进入收银台  进入收银台就先去查 要下单的商品 根据用的key+用户id并且根据传过来的ids 去查
     * @param model  前台展示的数据
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "cashier")
    private String queryShopCar(Model model,Integer totalPrice,int[] ids,HttpSession session) throws IOException {


        //下面Key的userId上线时用 这个从session中获取的id 此时再测试 暂时写死
        /*UserBean userBean = (UserBean) session.getAttribute(session.getId());

        Integer userId = userBean.getUserId();*/

        //根据用户的key去redis中查询对应的值
        String userKey = ConstantClass.FIND_USER_SHOP_CAR+"userId";


        //上数据库查询这个用户的商品
        List<ProductBean> list = orderService.queryShopCar(userKey,ids);


        model.addAttribute("count",list.size());

        model.addAttribute("totalPrice",totalPrice);

        model.addAttribute("list", list);
        return "view/cashier";
    }





















    @RequestMapping(value = "/goAlipay", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String goAlipay(@RequestParam(value = "request") HttpServletRequest request,
                  @RequestParam(value = "response") HttpServletRequest response,
                           @RequestParam(value = "price") String price) {
        return orderService.goAlipay(request,response,price);
    }

    @RequestMapping(value = "/queryOrder")
    public String queryOrder(Model model){
        List<OrderBean> orderBeans = orderService.queryOrder();
        model.addAttribute("list",orderBeans);
        return "view/order";
    }

    //生产订单
    @RequestMapping(value = "/addOrder")
    public String addOrder(){
        //等待把活数据传过来，先用死数据
        SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sim.format(new Date());
        OrderBean orderBean = new OrderBean();
        orderBean.setOrder_no(""+(System.currentTimeMillis() / 1000));//订单号
        orderBean.setOrder_city(1);//收获地址
        orderBean.setOrder_countPrice(120.4);//总价
        orderBean.setOrder_onePrice(30.1);//单价
        orderBean.setOrder_name("POLO衫");//商品名称
        orderBean.setOrder_createTime(format);//下单时间
        orderBean.setOrder_num(4);//买了几件
        orderBean.setOrder_type(5);//类型
        orderService.addOrder(orderBean);
        return "view/settle";
    }

}
