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
<!--header-->
<header>
    <!--topNavBg-->
    <div class="topNavBg">
        <div class="wrap">
            <!--topLeftNav-->
            <ul class="topLtNav">
                <li><a href="login.html" class="obviousText">亲，请登录</a></li>
                <li><a href="register.html">注册</a></li>
                <li><a href="#">移动端</a></li>
            </ul>
            <!--topRightNav-->
            <ul class="topRtNav">
                <li><a href="user.html">个人中心</a></li>
                <li><a href="cart.html" class="cartIcon">购物车<i>${count}</i></a></li>
                <li><a href="favorite.html" class="favorIcon">收藏夹</a></li>
                <li><a href="user.html">商家中心</a></li>
                <li><a href="article_read.html" class="srvIcon">客户服务</a></li>
                <li><a href="union_login.html">联盟管理</a></li>
            </ul>
        </div>
    </div>
    <!--logoArea-->
    <div class="wrap logoSearch">
        <!--logo-->
        <div class="logo">
            <h1><img src="images/logo.png"/></h1>
        </div>
        <!--search-->
        <div class="search">
            <ul class="switchNav">
                <li class="active" id="chanpin">产品</li>
                <li id="shangjia">商家</li>
                <li id="zixun">搭配</li>
                <li id="wenku">文库</li>
            </ul>
            <div class="searchBox">
                <form>
                    <div class="inputWrap">
                        <input type="text" placeholder="输入产品关键词或货号"/>
                    </div>
                    <div class="btnWrap">
                        <input type="submit" value="搜索"/>
                    </div>
                </form>
                <a href="#" class="advancedSearch">高级搜索</a>
            </div>
        </div>
    </div>
    <!--nav-->
    <nav>
        <ul class="wrap navList">
            <li class="category">
                <a>全部产品分类</a>
                <dl class="asideNav indexAsideNav">
                    <dt><a href="channel.html">女装</a></dt>
                    <dd>
                        <a href="#">夏装新</a>
                        <a href="#">连衣裙</a>
                        <a href="#">T恤</a>
                        <a href="#">衬衫</a>
                        <a href="#">裤子</a>
                        <a href="#">牛仔裤</a>
                        <a href="#">背带裤</a>
                        <a href="#">短外套</a>
                        <a href="#">时尚外套</a>
                        <a href="#">风衣</a>
                        <a href="#">毛衣</a>
                        <a href="#">背心</a>
                        <a href="#">吊带</a>
                        <a href="#">民族服装</a>
                    </dd>
                    <dt><a href="channel.html">男装</a></dt>
                    <dd>
                        <a href="#">衬衫</a>
                        <a href="#">背心</a>
                        <a href="#">西装</a>
                        <a href="#">POLO衫</a>
                        <a href="#">马夹</a>
                        <a href="#">皮衣</a>
                        <a href="#">毛衣</a>
                        <a href="#">针织衫</a>
                        <a href="#">牛仔裤</a>
                        <a href="#">外套</a>
                        <a href="#">夹克</a>
                        <a href="#">卫衣</a>
                        <a href="#">风衣</a>
                        <a href="#">民族风</a>
                        <a href="#">原创设计</a>
                        <a href="#">大码</a>
                        <a href="#">情侣装</a>
                        <a href="#">开衫</a>
                        <a href="#">运动裤</a>
                        <a href="#">工装裤</a>
                    </dd>
                </dl>
            </li>
            <li>
                <a href="index.html" class="active">首页</a>
            </li>
            <li>
                <a href="#">时尚搭配</a>
            </li>
            <li>
                <a href="channel.html">原创设计</a>
            </li>
            <li>
                <a href="channel.html">时尚代购</a>
            </li>
            <li>
                <a href="channel.html">民族风</a>
            </li>
            <li>
                <a href="information.html">时尚搭配</a>
            </li>
            <li>
                <a href="library.html">搭配知识</a>
            </li>
            <li>
                <a href="#">促销专区</a>
            </li>
            <li>
                <a href="#">其他</a>
            </li>
        </ul>
    </nav>

</header>
<script>
    $(document).ready(function () {
        //测试效果，程序对接如需变动重新编辑
        $(".switchNav li").click(function () {
            $(this).addClass("active").siblings().removeClass("active");
        });
        $("#chanpin").click(function () {
            $(".inputWrap input[type='text']").attr("placeholder", "输入产品关键词或货号");
        });
        $("#shangjia").click(function () {
            $(".inputWrap input[type='text']").attr("placeholder", "输入商家店铺名");
        });
        $("#zixun").click(function () {
            $(".inputWrap input[type='text']").attr("placeholder", "输入关键词查找文章内容");
        });
        $("#wenku").click(function () {
            $(".inputWrap input[type='text']").attr("placeholder", "输入关键词查找文库内容");
        });
    });

</script>

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
                <td class="center"><input type="checkbox" id="check${i.productId}" name="ck"
                                          value="${i.productPrice*i.productCount}" onclick="radiock()"/></td>
                <td class="center"><a href="product.html">
                        <img src="upload/goods.jpg" style="width:50px;height:50px;"/></a></td>
                <td>${i.productName}
                    <input type="hidden" value="${i.productId}">
                </td>
                <td>
                    <p>颜色：${i.productColor}</p>

                    <p>规格：${i.productSpec}</p>
                </td>
                <td class="center"><span class="rmb_icon" id="Price${i.productId}">${i.productPrice}</span></td>
                <td class="center">
                    <input type="button" value="-" class="jj_btn" onclick="reduce(${i.productId},${i.productPrice})"/>
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
            url: '/page/delShopCar',
            data: {
                id: id
            },
            success: function (data) {
                if (data){
                    location.href="/page/test";
                }
            }
        })
    }

    //点击结算按钮的操作
    function CheckoutCart() {

        //判断是否有商品
        var check = false;
        //先定义一个价格
        var totalPrice = 0;
        //先判断有没有选中商品
        $("input[name='ck']:checked").each(function (i) {
            check = $(this).is(":checked")
            var val = Number($(this).val());
            totalPrice = Number(accAdd(totalPrice, val));
        })
        if (!check) {
            alert("请选中你要购买的物品")
            return;
        }
        //如果有选中的商品 那么拿到商品的总价
        alert("您选中物品总价是："+totalPrice)


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
        count = count <= 1 ? 1 : --count;
        $("#count" + id).val(count);
        $("#valuation" + id).html(accMul(count, price));
        $("#check" + id).val(accMul(count, price))
    }

    //数量加
    function puls(id, price) {
        var count = $("#count" + id).val();
        $("#count" + id).val(++count);
        $("#valuation" + id).html(accMul(count, price));
        $("#check" + id).val(accMul(count, price))
    }

</script>
</body>
</html>