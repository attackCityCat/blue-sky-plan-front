<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>蓝天计划</title>

    <link rel="icon" href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/images/icon/favicon.ico"
          type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css">
    <script src="/js/html5.js"></script>
    <script src="/js/jquery.js"></script>
    <script src="/js/swiper.min.js"></script>

    <script>
        $(document).ready(function () {
            //焦点图
            var mySwiper = new Swiper('#slide', {
                autoplay: 5000,
                visibilityFullFit: true,
                loop: true,
                pagination: '.pagination',
            });
        })
    </script>
</head>
<body>
<!--advertisment<div class="wrap"><img src="upload/banner.jpg"/></div>-->
<!--header-->
<header>
    <!--topNavBg-->
    <div class="topNavBg">
        <div class="wrap">
            <!--topLeftNav-->
            <ul class="topLtNav">
                <li><a href="/page/toLogin" class="obviousText">亲，请登录</a></li>
                <li><a href="/page/toEnroll">注册</a></li>
                <li><a href="javascript:tan()">移动端</a></li>
            </ul>
            <!--topRightNav-->
            <ul class="topRtNav">
                <li><a href="javascript:tan()">个人中心</a></li>
                <li><a href="javascript:toShoppingCar('http://localhost:8084/page/test')" class="cartIcon">购物车<i>0</i></a></li>
                <li><a href="javascript:tan()" class="favorIcon">收藏夹</a></li>
                <li><a href="javascript:tan()">商家中心</a></li>
                <li><a href="javascript:tan()" class="srvIcon">客户服务</a></li>
                <li><a href="javascript:tan()">联盟管理</a></li>
            </ul>
        </div>
    </div>

    <!--logoArea-->
    <div class="wrap logoSearch">
        <!--logo-->
        <div class="logo">
            <h1><img src="/img/lantian.png" height="180" width="550"/></h1>
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
                        <input type="text" placeholder="输入产品关键词或货号">
                    </div>
                    <div class="btnWrap">
                        <input type="submit" value="搜索">
                    </div>
                </form>
                <a href="javascript:tan()" class="advancedSearch">高级搜索</a>
            </div>
        </div>
    </div>

    <nav>
        <ul class="wrap navList">
            <li class="category">
                <a id="menu-head">全部产品分类</a>
                <dl class="asideNav indexAsideNav" id="menu">
                    <dt><a href="javascript:tan()">女装</a></dt>
                    <dd>
                        <a href="javascript:tan()">夏装新</a>
                        <a href="javascript:tan()">连衣裙</a>
                        <a href="javascript:tan()">T恤</a>
                        <a href="javascript:tan()">衬衫</a>
                        <a href="javascript:tan()">裤子</a>
                        <a href="javascript:tan()">牛仔裤</a>
                        <a href="javascript:tan()">背带裤</a>
                        <a href="javascript:tan()">短外套</a>
                        <a href="javascript:tan()">时尚外套</a>
                        <a href="javascript:tan()">风衣</a>
                        <a href="javascript:tan()">毛衣</a>
                        <a href="javascript:tan()">背心</a>
                        <a href="javascript:tan()">吊带</a>
                        <a href="javascript:tan()">民族服装</a>
                    </dd>
                    <dt><a href="javascript:tan()">男装</a></dt>
                    <dd>
                        <a href="javascript:tan()">衬衫</a>
                        <a href="javascript:tan()">背心</a>
                        <a href="javascript:tan()">西装</a>
                        <a href="javascript:tan()">POLO衫</a>
                        <a href="javascript:tan()">马夹</a>
                        <a href="javascript:tan()">皮衣</a>
                        <a href="javascript:tan()">毛衣</a>
                        <a href="javascript:tan()">针织衫</a>
                        <a href="javascript:tan()">牛仔裤</a>
                        <a href="javascript:tan()">外套</a>
                        <a href="javascript:tan()">夹克</a>
                        <a href="javascript:tan()">卫衣</a>
                        <a href="javascript:tan()">风衣</a>
                        <a href="javascript:tan()">民族风</a>
                        <a href="javascript:tan()">原创设计</a>
                        <a href="javascript:tan()">大码</a>
                        <a href="javascript:tan()">情侣装</a>
                        <a href="javascript:tan()">开衫</a>
                        <a href="javascript:tan()">运动裤</a>
                        <a href="javascript:tan()">工装裤</a>
                    </dd>
                </dl>
            </li>
            <li>
                <a href="javascript:toMain()" class="active">首页</a>
            </li>
            <li>
                <a href="javascript:tan()">时尚搭配</a>
            </li>
            <li>
                <a href="javascript:tan()">原创设计</a>
            </li>
            <li>
                <a href="javascript:tan()">时尚代购</a>
            </li>
            <li>
                <a href="javascript:tan()">民族风</a>
            </li>
            <li>
                <a href="javascript:tan()">时尚搭配</a>
            </li>
            <li>
                <a href="javascript:tan()">搭配知识</a>
            </li>
            <li>
                <a href="javascript:tan()">促销专区</a>
            </li>
            <li>
                <a href="javascript:tan()">其他</a>
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
<div id="window" style="height: 1100px;">
<!--advertisment area-->
<section class="wrap">
    <!--ctCont-->
    <div class="IdxmainArea">
        <!--slide-->
        <div id="slide" class="swiper-container-horizontal">

            <a href="javascript:tan()">
                <img src="/img/slide01.png">
            </a>

        </div>
        <!--singleAd-->
        <div class="singleAd">
            <a href="javascript:tan()">
                <img src="/img/sigleAd.png">
            </a>
        </div>
        <!--bestShop-->
        <dl class="bestShop">
            <dt>
                <strong>中国蓝天计划优质商店🇨🇳</strong>
            </dt>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg" height="150" width="150"/>
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
            <dd>
                <a href="javascript:tan()">
                    <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/timg.jpg">
                    <h2>China Number One</h2>
                </a>
            </dd>
        </dl>
    </div>

    <!--asdCont-->
    <div class="IdxAsideRt">
        <!--login-->
        <div class="idxRtLogin">
            <div class="fstArea">
                <a href="javascript:tan()" class="userIcon">
                    <img src="/img/DefaultAvatar.png">
                </a>
                <div class="rtInfor">
                    <p>Hi!你好</p>
                    <p class="obviousText">免费入驻，提升品牌效应！</p>
                </div>
            </div>
            <div class="secArea">
                <a href="/page/toLogin">登录</a>
                <a href="/page/toEnroll">免费注册</a>
                <a href="javascript:tan()">商户入驻</a>
            </div>
        </div>
        <dl class="idxRtAtc">
            <dt>
                <em class="obviousText">最新公告</em>
                <a href="javascript:tan()">more</a>
            </dt>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告统升级通告</a></dd>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告</a></dd>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告</a></dd>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告</a></dd>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告</a></dd>
        </dl>
        <dl class="idxRtAtc">
            <dt>
                <em>质量标准技术参数</em>
                <a href="javascript:tan()">more</a>
            </dt>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告统升级通告</a></dd>
            <dd><a href="javascript:tan()">2015年12月20日系统升级通告</a></dd>
        </dl>
    </div>
</section>

<section class="wrap idxproLi">
    <h2>
        <strong>
            <a href="javascript:tan()">精品女装</a>
        </strong>
        <span class="classLi">
   <a href="javascript:tan()">夏装</a>
   <a href="javascript:tan()">连衣裙</a>
   <a href="javascript:tan()">开衫</a>
   <a href="javascript:tan()">牛仔裤</a>
   <a href="javascript:tan()">背带裤</a>
   <a href="javascript:tan()">T恤</a>
  </span>
    </h2>
    <div class="ltArea">
        <!--ad:category pic-->
        <img src="/img/bestCategoryPic02.png"></a>
    </div>
    <div class="ctLi">
        <!--此处数据要从数据库加载出来，并且点击时要跳转到详情页面-->
        <ul>
            <#list list as i >
                <li>
                    <a href="javascript:commodityDetails(${i.id})">
                        <img src="${i.img}">
                        <h3>${i.productTitle}</h3>
                        <p><span>${i.productPrice}</span></p>
                    </a>
                </li>
            </#list>
        </ul>
        <!--bestBrand-->
        <div class="idxBrandLi">
            <a href="javascript:tan()"><img src="/img/brandLogo01.png"></a>
            <a href="javascript:tan()"><img src="/img/brandLogo02.png"></a>
            <a href="javascript:tan()"><img src="/img/brandLogo03.png"></a>
            <a href="javascript:tan()"><img src="/img/brandLogo04.png"></a>
        </div>
    </div>
</section>

<!--productList-->
<section class="wrap idxproLi">
    <h2>
        <strong>
            <a href="javascript:tan()">时尚男装</a>
        </strong>
        <span class="classLi">
   <a href="javascript:tan()">夏装</a>
   <a href="javascript:tan()">连衣裙</a>
   <a href="javascript:tan()">开衫</a>
   <a href="javascript:tan()">牛仔裤</a>
   <a href="javascript:tan()">背带裤</a>
   <a href="javascript:tan()">T恤</a>
  </span>
    </h2>
    <div class="ltArea">
        <!--ad:category pic 精品男装图-->
        <img src="https://lantianjihua.oss-cn-beijing.aliyuncs.com/nan.jpg">
    </div>

    <div class="ctLi">
        <ul>
            <#list listMan as n >
                <li>
                    <a href="javascript:commodityManDetails(${n.id})">
                        <img src="${n.img}">
                        <h3>${n.productTitle}</h3>
                        <p><span>${n.productPrice}</span></p>
                    </a>
                </li>
            </#list>
        </ul>
        <!--bestBrand-->
        <div class="idxBrandLi">
            <a href="javascript:tan()"><img src="/img/brandLogo01.png"></a>
            <a href="javascript:tan()"><img src="/img/brandLogo02.png"></a>
            <a href="javascript:tan()"><img src="/img/brandLogo03.png"></a>
            <a href="javascript:tan()"><img src="/img/brandLogo04.png"></a>
        </div>
    </div>
</section>

<!--case-->
<section class="wrap idexCase">
    <h2>
        <strong>服装搭配</strong>
        <a href="javascript:tan()">more</a>
    </h2>
    <ul>
        <li>
            <a href="javascript:tan()">
                <img src="/img/case001.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="javascript:tan()">
                <img src="/img/case002.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="javascript:tan()">
                <img src="/img/case003.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="javascript:tan()">
                <img src="/img/case004.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="javascript:tan()">
                <img src="/img/case005.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
    </ul>
</section>

<section class="wrap idxArticle">
    <dl>
        <dt>
            <strong>招标资讯</strong>
            <a href="javascript:tan()">more</a>
        </dt>
        <dd><a href="javascript:tan()">中国蓝天计划项目公开招标招标公告</a></dd>
        <dd><a href="javascript:tan()">中国蓝天计划项目公开招标招标公告</a></dd>
        <dd><a href="javascript:tan()">中国蓝天计划项目公开招标招标公告</a></dd>
        <dd><a href="javascript:tan()">中国蓝天计划项目公开招标招标公告</a></dd>
        <dd><a href="javascript:tan()">中国蓝天计划项目公开招标招标公告</a></dd>
    </dl>
    <dl style="margin:0 2.5%">
        <dt>
            <strong>团队招人</strong>
            <a href="javascript:tan()">more</a>
        </dt>
        <dd><a href="javascript:tan()">蓝天计划高质量高品质团队招人</a></dd>
        <dd><a href="javascript:tan()">蓝天计划高质量高品质团队招人</a></dd>
        <dd><a href="javascript:tan()">蓝天计划高质量高品质团队招人</a></dd>
        <dd><a href="javascript:tan()">蓝天计划高质量高品质团队招人</a></dd>
        <dd><a href="javascript:tan()">蓝天计划高质量高品质团队招人</a></dd>
    </dl>
    <dl>
        <dt>
            <strong>团队福利</strong>
            <a href="javascript:tan()">more</a>
        </dt>
        <dd><a href="javascript:tan()">待遇雄厚，福利火爆，更多详情请大喊“班长”</a></dd>
        <dd><a href="javascript:tan()">待遇雄厚，福利火爆，更多详情请大喊“班长”</a></dd>
        <dd><a href="javascript:tan()">待遇雄厚，福利火爆，更多详情请大喊“班长”</a></dd>
        <dd><a href="javascript:tan()">待遇雄厚，福利火爆，更多详情请大喊“班长”</a></dd>
    </dl>
</section>

<footer>
    <!--help-->
    <ul class="wrap help">
        <li>
            <dl>
                <dt>消费者保障</dt>
                <dd><a href="javascript:tan()">保障范围</a></dd>
                <dd><a href="javascript:tan()">退换货流程</a></dd>
                <dd><a href="javascript:tan()">服务中心</a></dd>
                <dd><a href="javascript:tan()">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>新手上路</dt>
                <dd><a href="javascript:tan()">保障范围</a></dd>
                <dd><a href="javascript:tan()">退换货流程</a></dd>
                <dd><a href="javascript:tan()">服务中心</a></dd>
                <dd><a href="javascript:tan()">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>付款方式</dt>
                <dd><a href="javascript:tan()">保障范围</a></dd>
                <dd><a href="javascript:tan()">退换货流程</a></dd>
                <dd><a href="javascript:tan()">服务中心</a></dd>
                <dd><a href="javascript:tan()">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>服务保障</dt>
                <dd><a href="javascript:tan()">保障范围</a></dd>
                <dd><a href="javascript:tan()">退换货流程</a></dd>
                <dd><a href="javascript:tan()">服务中心</a></dd>
                <dd><a href="javascript:tan()">更多服务特色</a></dd>
            </dl>
        </li>
    </ul>
    <div class="wrap btmInfor">
        <p>© 2013 DeathGhost.cn 版权所有 网络文化经营许可证：浙网文[2013]***-027号 增值电信业务经营许可证：浙B2-200***24-1 信息网络传播视听节目许可证：1109***4号</p>
        <address>联系地址：北京市海淀区西三旗悦秀路金科教育 1810A 班</address>
    </div>
</footer>
</div>
<script type="text/javascript">

    function tan() {
        alert("感谢您的关注，功能正在开发中！~")
    }

    //点击商品时进入详情页面
    function commodityDetails(id) {
        location.href = "/page/queryShopDetails?id=" + id;
    }

    function commodityManDetails(id) {
        location.href = "/page/queryShopDetails?id=" + id;
    }

    var menuShow = true;

    showOrHideMenu = function(){
        if (menuShow) {
            $("#menu").hide();
            menuShow = false;
        }else {
            $("#menu").show();
            menuShow = true;
        }
    }

    showMenu = function(){
        $("#menu").show();
        menuShow = true;
    }

    hideMenu = function(){
        $("#menu").hide();
        menuShow = false;
    }


    $("#menu-head").mouseover(function () {
        showOrHideMenu();
    })


    toMain = function(){
        location.href = "/page/toMain";
        showMenu();
    }



    toShoppingCar = function(url){
        hideMenu();
        createIframe(url);
    }
    createIframe = function(url){
        $("#window").html("<iframe src='"+url+"' style='width:99%; height:99%;' frameborder='no'></iframe>");
    }



</script>
</body>
</html>