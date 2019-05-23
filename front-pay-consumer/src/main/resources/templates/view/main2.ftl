<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="icon" href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/style.css">
    <script src="/html5.js"></script>
    <script src="/jquery.js"></script>
    <script src="/swiper.min.js"></script>
    <title>Title</title>
</head>
<style>
    #hide {
        display: none;
        padding-top: 15px;
        margin-left: 180px;
    }
</style>
<body>
<!--header-->
<header>
    <!--topNavBg-->
    <div class="topNavBg">
        <div class="wrap">
            <!--topLeftNav-->
            <ul class="topLtNav">
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/login.html" class="obviousText">亲，请登录</a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/register.html">注册</a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">移动端</a></li>
            </ul>
            <!--topRightNav-->
            <ul class="topRtNav">
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/user.html">个人中心</a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/cart.html" class="cartIcon">购物车<i>0</i></a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/favorite.html" class="favorIcon">收藏夹</a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/user.html">商家中心</a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html" class="srvIcon">客户服务</a></li>
                <li><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/union_login.html">联盟管理</a></li>
            </ul>
        </div>
    </div>

<form id="saveOrderForm">

</form>
    <!--logoArea-->
    <div class="wrap logoSearch">

        <!--search-->

        <div class="search">
            <ul class="switchNav">
                <li id="chanpin" data="1" onclick="xx(this)">产品</li>
                <li id="shangjia" data="2" onclick="xx(this)">商家</li>
                <li id="zixun" data="3" onclick="xx(this)">搭配</li>
                <li id="wenku" data="4" onclick="xx(this)">文库</li>
                <input type="hidden" id="hiddenId" value="1"/>
            </ul>
            <div class="searchBox">
                <form id="serach_form">
                    <div class="inputWrap">
                        <input type="text" id="queryShop" placeholder="输入产品关键词或货号">
                    </div>
                    <div class="btnWrap">
                        <input type="button" id="queryShopBySolr" value="搜索">
                    </div>
                </form>

                <a href="javascript:void(0)" id="show" class="advancedSearch">高级搜索</a>

                <!--点击高级搜索出的div-->
                <br><br>
                <div id="hide">
                    <br>
                    <table>
                        <tr>
                            <td width="80px"><span style="color:#a9a9a9;font-size:18px">价格:</span></td>
                            <td width="120px" height="40px" onclick="queryShopByPrice1()"><span id="price1" style="color:#a9a9a9;font-size:18px">￥10~50</span></td>
                            <td width="120px" onclick="queryShopByPrice2()"><span id="price2" style="color:#a9a9a9;font-size:18px">￥50~100</span></td>
                            <td width="120px" onclick="queryShopByPrice3()"><span id="price3" style="color:#a9a9a9;font-size:18px">￥100~150</span></td>
                            <td width="120px" ></td>
                            <td width="120px" onclick="closeDiv()"><span style="color:#a9a9a9;font-size:18px">x</span></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td width="120px" height="40px" onclick="queryShopByPrice4()"><span id="price4" style="color:#a9a9a9;font-size:18px">￥150~200</span></td>
                            <td colspan="2" onclick="queryShopByPrice5()"><span id="price5" style="color:#a9a9a9;font-size:18px">￥500~1000</span></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td width="100px" onclick="asc()"><span id="asc" style="color:#a9a9a9">价格↑</span></td>
                            <td colspan="2" onclick="desc()"><span id="desc" style="color:#a9a9a9">价格↓</span></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

    </div>
<script type="text/javascript">
    //初始化查询图片
    $(function(){
        queryImg();
    });

    //排序
    function asc(){
        location.href="/shop/queryShopList?hiId="+1;
    }
    function desc(){
        location.href="/shop/queryShopList?hiId="+2;
    }

    //按价格区间搜索
    function queryShopByPrice1(){
        var price = $("#price1").text();
        var subString = price.substr(1);
        location.href="/shop/queryShopList?price="+subString;
    }
    function queryShopByPrice2(){
        var price = $("#price2").text();
        var subString = price.substr(1);
        location.href="/shop/queryShopList?price="+subString;
    }
    function queryShopByPrice3(){
        var price = $("#price3").text();
        var subString = price.substr(1);
        location.href="/shop/queryShopList?price="+subString;
    }
    function queryShopByPrice4(){
        var price = $("#price4").text();
        var subString = price.substr(1);
        location.href="/shop/queryShopList?price="+subString;
    }
    function queryShopByPrice5(){
        var price = $("#price5").text();
        var subString = price.substr(1);
        location.href="/shop/queryShopList?price="+subString;
    }

    //打开div
    window.onload = function() {

        /*这里发请求 在请求的回调函数写 下面那个关闭*/
        //打开
        document.getElementById("show").onclick = function () {
            document.getElementById("hide").style.display = "block";
        }
    }
        //关闭
        function closeDiv(){
            document.getElementById("hide").style.display = "none";
        }






    //查询图片
    function queryImg(){
        //根据name获取id
        var hiddenId = document.getElementsByName("hiddenId");
        var ids = "";
        //遍历根据，截取
        for (var i= 0 ;i<hiddenId.length;i++){
            ids += ids==""? hiddenId[i].value : ","+hiddenId[i].value;
        }

        $.ajax({
            url:'/shop/queryImg',
            type:'post',
            data:{
                ids:ids
            },
            success:function(data){
                for (var i = 0;i < data.length;i++){
                   $("#imgId"+i).attr("src",data[i].url);
                }
            }
        })
    }
    //点击查询
    $("#queryShopBySolr").click(function(){
        location.href="/shop/queryShopList?queryShop="+$("#queryShop").val();
    })
</script>

</header>
<section class="wrap shop_goods_li">
    <h2>产品</h2>
    <ul class="favorite_list">
        <#assign index = -1 >
        <#list list as i>
        <li>
            <a>
                <#assign index = index+1>
                <img src="" id="imgId${index}">
            </a>
                <!-- 商品名称 -->
                <h3>${i.product_title}</h3>
            <input type="hidden" value="${i.product_id}" name="hiddenId">
                <p class="price"><span class="rmb_icon">${i.product_price}</span></p>
                <p class="shop_collect_goods" title="收藏该产品"><span>&#115;</span></p>

        </li>
    </#list>
    </ul>
    <!--分页-->
</section>
<!--footer-->
<script type="text/javascript">

</script>
</body>
</html>