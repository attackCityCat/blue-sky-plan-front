<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8"/>
    <title>购物车</title>
    <meta name="keywords" content="DeathGhost"/>
    <meta name="description" content="DeathGhost"/>
    <meta name="author" content="DeathGhost,deathghost@deathghost.cn">
    <link rel="icon" href="images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css"/>
    <script src="/js/html5.js"></script>
    <script src="/js/jquery.js"></script>

    <script>
        $(document).ready(function () {
            $("nav .indexAsideNav").hide();
            $("nav .category").mouseover(function () {
                $(".asideNav").slideDown();
            });
            $("nav .asideNav").mouseleave(function () {
                $(".asideNav").slideUp();
            });
        });
    </script>
</head>
<body>


<section class="wrap" style="margin-top:20px;overflow:hidden;">
        <table class="order_table">
            <tr>
                <th><input type="checkbox" id="checkAll"/></th>
                <th>产品</th>
                <th>名称</th>
                <th>属性</th>
                <th>单价</th>
                <th>数量</th>
                <th>小计</th>
                <th>操作</th>
            </tr>

            <#list list as i>
                <tr>
                    <td class="center"><input type="checkbox" id="check${i.productId}" data="${i.productId}" name="ck"
                                              value="${i.productPrice*i.productCount}" onclick="radiock()"/></td>
                    <td class="center"><a href="javascript:commodityDetails(${i.productId});">
                            <img src="${i.productImg}" style="width:50px;height:50px;"/></a></td>
                    <td>${i.productName}
                        <input type="hidden" value="${i.productId}">
                    </td>
                    <td>
                        <p>颜色：${i.productColor}</p>

                        <p>规格：${i.productSpec}</p>
                    </td>
                    <td class="center"><span class="rmb_icon" id="Price${i.productId}">${i.productPrice}</span></td>
                    <td class="center">
                        <input type="button" value="-" class="jj_btn"
                               onclick="reduce(${i.productId},${i.productPrice})"/>
                        <input type="text" value="${i.productCount}" class="number" readonly id="count${i.productId}"/>
                        <input type="button" value="+" class="jj_btn" onclick="puls(${i.productId},${i.productPrice})"/>
                    </td>
                    <#--小计-->
                    <td class="center"><strong class="rmb_icon"><span
                                    id="valuation${i.productId}">${i.productPrice*i.productCount}</span></strong>
                    </td>
                    <td class="center"><a href="javascript:delShopCar(${i.productId})">删除</a></td>
                </tr>
            </#list>
        </table>

    <div class="order_btm_btn">
        <#--href="index.html 写上自己的首页地址即可"-->
        <a class="link_btn_01 buy_btn" id="continueShopping"/>继续购买</a>
        <#-- href="order_confirm.html"-->
        <a href="javascript:CheckoutCart()" class="link_btn_02 add_btn"/>共计金额<strong class="rmb_icon"><span
                    id="rmbId">0.00</span></strong>立即结算</a>
    </div>
</section>
<!--footer-->


<script type="text/javascript">

    //点击继续购买时的操作
    $("#continueShopping").click(function () {
        alert("功能正在开发中")
    })

    //删除购物车的商品
    function delShopCar(id) {
        $.ajax({
            url: '/car/page/delShopCar',
            data: {
                id: id
            },
            success: function (data) {
                if (data) {
                    location.href = "/car/page/test";
                }
            }
        })
    }

    //点击结算按钮的操作
    function CheckoutCart() {
        //判断是否有商品
        var check = false;
        var n = 0;
        //先定义一个价格
        var totalPrice = 0;
        //获取到选中商品的id；
        var ids = "";
        ///所有复选框
        $("input[name='ck']:checked").each(function(i){
            n++;
            var price = Number($(this).val());
            totalPrice = Number(accAdd(totalPrice, price));
            ids+= ids == "" ? $(this).attr("data") : ","+$(this).attr("data");
        })
        if (n > 0){
            check = true;
        }
        //判断有没有选中商品
        if (!check) {
            alert("请选中你要购买的物品")
            return;
        }
        //发送请求到收银台啊
        location.href="http://localhost:8088/order/cashier?totalPrice="+totalPrice+"&ids="+ids +"&userId=${uId}";
    }

    //点击全选时复选框的操作
    $("#checkAll").click(function () {
        $(":checkbox[name='ck']").prop("checked", this.checked); // this指代的你当前选择的这个元素的JS对象
        var arr = document.getElementsByName("ck");
        var sum = 0;
        $("input[name='ck']:checked").each(function (i) {
            var val = Number($(this).val());
            sum = Number(accAdd(sum, val));
        })
        $("#rmbId").html(sum);
    });

    //点击一个商品的复选框的操作
    function radiock() {
        var sum = 0;
        $("input[name='ck']:checked").each(function (i) {
            var val = Number($(this).val());
            sum = Number(accAdd(sum, val));
        })
        $("#rmbId").html(sum);
    }


    //精确计算
    function accMul(arg1, arg2) {
        var m = 0, s1 = arg1.toString(), s2 = arg2.toString();
        try {
            m += s1.split(".")[1].length
        } catch (e) {
        }
        try {
            m += s2.split(".")[1].length
        } catch (e) {
        }
        return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m)
    }

    //js 加法计算
    //调用：accAdd(arg1,arg2)
    //返回值：arg1加arg2的精确结果
    function accAdd(arg1, arg2) {
        var r1, r2, m;
        try {
            r1 = arg1.toString().split(".")[1].length
        } catch (e) {
            r1 = 0
        }
        try {
            r2 = arg2.toString().split(".")[1].length
        } catch (e) {
            r2 = 0
        }
        m = Math.pow(10, Math.max(r1, r2))
        return ((arg1 * m + arg2 * m) / m).toFixed(2);
    }


    //数量减
    function reduce(id, price) {
        var count = $("#count" + id).val();
        if(count<=1){
            alert("不要请删除 不要在减了")
            return;
        }
        $.ajax({
            url:'/page/reduceCount',
            data:{
                id:id
            },
            success:function () {
                var count = $("#count" + id).val();
                count = count <= 1 ? 1 : --count;
                $("#count" + id).val(count);
                $("#valuation" + id).html(accMul(count, price));
                $("#check" + id).val(accMul(count, price))
            }
        })
    }

    //数量加
    function puls(id, price) {

        $.ajax({
            url:'/page/pulsCount',
            data:{
                id:id
            },
            success:function () {
                var count = $("#count" + id).val();
                $("#count" + id).val(++count);
                $("#valuation" + id).html(accMul(count, price));
                $("#check" + id).val(accMul(count, price))
            }
        })
    }

    //点击商品时进入详情页面
    function commodityDetails(id) {
        location.href = "http://localhost:8082/page/queryShopDetails?id=" + id;
    }

</script>
</body>
</html>