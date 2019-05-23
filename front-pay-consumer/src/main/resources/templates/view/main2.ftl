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
        margin-left: 500px;
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


            </div>
        </div>

    </div>
<script type="text/javascript">
    //初始化查询图片
    $(function(){
        queryImg();
    });

    window.onload = function() {

        document.getElementById("show").onclick = function() {

            //在这个id里面写东西
            document.getElementById("hide").style.display = "block";
            /*这里发请求 在请求的回调函数写 下面那个关闭*/
        }

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
</script>
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