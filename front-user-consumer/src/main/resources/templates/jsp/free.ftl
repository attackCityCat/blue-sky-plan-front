<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>蓝天计划</title>

    <link rel="icon" href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css">
    <script src="/js/html5.js"></script>
    <script src="/js/jquery.js"></script>
    <script src="/js/swiper.min.js"></script>

    <style type="text/css">
        #menu-head:hover {
            display: inline-block;
        }
    </style>

    <script>
        $(document).ready(function(){
            //焦点图
            var mySwiper = new Swiper('#slide',{
                autoplay:5000,
                visibilityFullFit : true,
                loop:true,
                pagination : '.pagination',
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
                <li><a href="/page/toLogin" class="obviousText">你好!</a></li>
                <li><a href="">欢迎</a></li>
                <li><a href="">
                        ${(user.name)!'请登录'}
                        </a></li>
            </ul>
            <!--topRightNav-->
            <ul class="topRtNav">
                <li><a href="/page/toUserCenter">个人中心</a></li>
                <li><a href="JavaScript:toShoppingCar('http://localhost:8084/page/test');" class="cartIcon">购物车<i>0</i></a></li>
                <li><a href="JavaScript:;" class="favorIcon">收藏夹</a></li>
                <li><a href="">商家中心</a></li>
                <li><a href="" class="srvIcon">客户服务</a></li>
                <li><a href="">联盟管理</a></li>
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
                <a href="" class="advancedSearch">高级搜索</a>
            </div>
        </div>
    </div>

    <nav>
        <ul class="wrap navList">
            <li class="category">
                <a id="menu-head">全部产品分类</a>
                <div id="menubox">
                    <dl class="asideNav indexAsideNav" id="menu">
                        <dt><a href="#">女装</a></dt>
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
                        <dt><a href="#">男装</a></dt>
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
                </div>
            </li>
            <li>
                <a href="/page/toUSer" class="active">首页</a>
            </li>
            <li>
                <a href="#">时尚搭配</a>
            </li>
            <li>
                <a href="#">原创设计</a>
            </li>
            <li>
                <a href="#">时尚代购</a>
            </li>
            <li>
                <a href="#">民族风</a>
            </li>
            <li>
                <a href="#">时尚搭配</a>
            </li>
            <li>
                <a href="#">搭配知识</a>
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
    $(document).ready(function(){
        //测试效果，程序对接如需变动重新编辑
        $(".switchNav li").click(function(){
            $(this).addClass("active").siblings().removeClass("active");
        });
        $("#chanpin").click(function(){
            $(".inputWrap input[type='text']").attr("placeholder","输入产品关键词或货号");
        });
        $("#shangjia").click(function(){
            $(".inputWrap input[type='text']").attr("placeholder","输入商家店铺名");
        });
        $("#zixun").click(function(){
            $(".inputWrap input[type='text']").attr("placeholder","输入关键词查找文章内容");
        });
        $("#wenku").click(function(){
            $(".inputWrap input[type='text']").attr("placeholder","输入关键词查找文库内容");
        });
    });

</script>
<div id="window" style="height: 500px">
<!--advertisment area-->
<section class="wrap">
    <!--ctCont-->
    <div class="IdxmainArea">
        <!--slide-->
        <div id="slide" class="swiper-container-horizontal">
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
                <img src="/img/slide01.png">
            </a>
        </div>
        <!--singleAd-->
        <div class="singleAd">
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
                <img src="/img/sigleAd.png">
            </a>
        </div>
        <!--bestShop-->
        <dl class="bestShop">
            <dt>
                <strong>优秀商家推荐</strong>
                <a href="#">更多</a>
            </dt>
            <dd>
                <a href="">
                    <img src="/img/001.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/002.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/003.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/001.png" height="150" width="150"/>
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/005.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/006.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/007.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
            <dd>
                <a href="">
                    <img src="/img/008.png">
                    <h2>DM精品女装</h2>
                </a>
            </dd>
        </dl>
    </div>

    <!--asdCont-->
    <div class="IdxAsideRt">
        <!--login-->
        <div class="idxRtLogin">
            <div class="fstArea">
                <a href="" class="userIcon">
                    <img src="${user.headImg!}">
                </a>
                <div class="rtInfor">
                    <p>Hi!你好</p>
                    <p class="obviousText">${user.name} 用户 已登陆</p>
                </div>
            </div>
            <div class="classLi">
                <a href="">&nbsp;待发货&nbsp;|</a>
                <a href="">&nbsp;待收货&nbsp;|</a>
                <a href="">待评价</a>
            </div>
        </div>
        <dl class="idxRtAtc">
            <dt>
                <em class="obviousText">最新公告</em>
                <a href="#">more</a>
            </dt>
            <dd>2019年5月20日 11:27:59 升级展示页面</dd>
            <dd>2019年5月20日 11:27:59 升级展示页面</dd>
            <dd>2019年5月20日 11:27:59 升级展示页面</dd>
            <dd>2019年5月20日 11:27:59 升级展示页面</dd>
        </dl>
        <dl class="idxRtAtc">
            <dt>
                <em>质量标准技术参数</em>
                <a href="#">more</a>
            </dt>
            <dd>2019年5月20日 11:29:21 网站前台升级</dd>
            <dd>2019年5月20日 11:29:34 网络畅通</dd>
        </dl>
    </div>
</section>

<section class="wrap idxproLi">
    <h2>
        <strong>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/channel.html">精品女装</a>
        </strong>
        <span class="classLi">
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">夏装</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">连衣裙</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">开衫</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">牛仔裤</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">背带裤</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">T恤</a>
  </span>
    </h2>
    <div class="ltArea">
        <!--ad:category pic-->
        <a href="">
            <img src="/img/bestCategoryPic02.png"></a>
    </div>
    <div class="ctLi">
        <ul>
            <li>
                <a href="">
                    <img src="/img/goods005.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1000.00</span></p>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="/img/goods006.png">
                    <h3>2019时尚新款</h3>
                    <p><span>545.00</span></p>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="/img/goods007.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1000.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods008.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1000.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods009.png">
                    <h3>2019时尚新款</h3>
                    <p><span>980.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods010.png">
                    <h3>2019时尚新款</h3>
                    <p><span>642.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods005.png">
                    <h3>2019时尚新款</h3>
                    <p><span>793.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods006.png">
                    <h3>2019时尚新款</h3>
                    <p><span>755.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods007.png">
                    <h3>2019时尚新款</h3>
                    <p><span>360.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods008.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1255.00</span></p>
                </a>
            </li>
        </ul>
        <!--bestBrand-->
        <div class="idxBrandLi">
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo01.png"></a>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo02.png"></a>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo03.png"></a>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo04.png"></a>
        </div>
    </div>
</section>

<!--productList-->
<section class="wrap idxproLi">
    <h2>
        <strong>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/channel.html">时尚女装</a>
        </strong>
        <span class="classLi">
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">夏装</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">连衣裙</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">开衫</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">牛仔裤</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">背带裤</a>
   <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html">T恤</a>
  </span>
    </h2>
    <div class="ltArea">
        <!--ad:category pic-->
        <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product_list.html"><img src="/img/bestCategoryPic01.png"></a>
    </div>
    <div class="ctLi">
        <ul>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods001.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1000.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods003.png">
                    <h3>2019时尚新款</h3>
                    <p><span>545.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods004.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1000.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods003.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1000.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods001.png">
                    <h3>2019时尚新款</h3>
                    <p><span>980.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods002.png">
                    <h3>2019时尚新款</h3>
                    <p><span>642.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods004.png">
                    <h3>2019时尚新款</h3>
                    <p><span>793.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods001.png">
                    <h3>2019时尚新款</h3>
                    <p><span>755.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods002.png">
                    <h3>2019时尚新款</h3>
                    <p><span>360.00</span></p>
                </a>
            </li>
            <li>
                <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/product.html">
                    <img src="/img/goods003.png">
                    <h3>2019时尚新款</h3>
                    <p><span>1255.00</span></p>
                </a>
            </li>
        </ul>
        <!--bestBrand-->
        <div class="idxBrandLi">
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo01.png"></a>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo02.png"></a>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo03.png"></a>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/shop.html"><img src="/img/brandLogo04.png"></a>
        </div>
    </div>
</section>

<!--case-->
<section class="wrap idexCase">
    <h2>
        <strong>服装搭配</strong>
        <a href="">more</a>
    </h2>
    <ul>
        <li>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
                <img src="/img/case001.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
                <img src="/img/case002.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
                <img src="/img/case003.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
                <img src="/img/case004.png">
                <h3>时尚搭配案例</h3>
            </a>
        </li>
        <li>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/index.html#">
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
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_list.html">more</a>
        </dt>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">内蒙古君联生物发展有限公司阿巴嘎旗流化床锅炉除尘及链条炉排炉内脱硫设施采购项目公开招标招标公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">四川省老年大学教学用具及设备采购二标段公开招标采购公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">慢道峰山桥至仙境源风机路、曲径通幽至老虎洞至孙家至王沟服务区亮化工程公开招标公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">四川省资阳市安岳县民政局第二次全国地名普查外包服务采购项目公开招标采购公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">内蒙古君联生物发展有限公司阿巴嘎旗流化床锅炉除尘及链条炉排炉内脱硫设施采购项目公开招标招标公告</a></dd>
    </dl>
    <dl style="margin:0 2.5%">
        <dt>
            <strong>最新询价信息</strong>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_list.html">more</a>
        </dt>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">内蒙古君联生物发展有限公司阿巴嘎旗流化床锅炉除尘及链条炉排炉内脱硫设施采购项目公开招标招标公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">四川省老年大学教学用具及设备采购二标段公开招标采购公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">慢道峰山桥至仙境源风机路、曲径通幽至老虎洞至孙家至王沟服务区亮化工程公开招标公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">四川省资阳市安岳县民政局第二次全国地名普查外包服务采购项目公开招标采购公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">内蒙古君联生物发展有限公司阿巴嘎旗流化床锅炉除尘及链条炉排炉内脱硫设施采购项目公开招标招标公告</a></dd>
    </dl>
    <dl>
        <dt>
            <strong>行业资讯</strong>
            <a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_list.html">more</a>
        </dt>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">内蒙古君联生物发展有限公司阿巴嘎旗流化床锅炉除尘及链条炉排炉内脱硫设施采购项目公开招标招标公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">四川省老年大学教学用具及设备采购二标段公开招标采购公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">慢道峰山桥至仙境源风机路、曲径通幽至老虎洞至孙家至王沟服务区亮化工程公开招标公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">四川省资阳市安岳县民政局第二次全国地名普查外包服务采购项目公开招标采购公告</a></dd>
        <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">内蒙古君联生物发展有限公司阿巴嘎旗流化床锅炉除尘及链条炉排炉内脱硫设施采购项目公开招标招标公告</a></dd>
    </dl>
</section>


</div>

<footer>
    <!--help-->
    <ul class="wrap help">
        <li>
            <dl>
                <dt>消费者保障</dt>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">保障范围</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">退换货流程</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">服务中心</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>新手上路</dt>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">保障范围</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">退换货流程</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">服务中心</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>付款方式</dt>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">保障范围</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">退换货流程</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">服务中心</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>服务保障</dt>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">保障范围</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">退换货流程</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">服务中心</a></dd>
                <dd><a href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/article_read.html">更多服务特色</a></dd>
            </dl>
        </li>
    </ul>
    <div class="wrap btmInfor">
        <p>© 2013 DeathGhost.cn 版权所有 网络文化经营许可证：浙网文[2013]***-027号 增值电信业务经营许可证：浙B2-200***24-1 信息网络传播视听节目许可证：1109***4号</p>
        <address>联系地址：北京市海淀区西三旗悦秀路金科教育 1810A 班</address>
    </div>
</footer>
</body>
<script type="text/javascript">
    hiedMenu = function(){
        $("#menu").hide();
    }

    showMenu = function(){
        $("#menu").show();
    }

    $("#menu-head").mouseover(function () {
        $("#menu").show();
    })

    $("#menubox").mouseout(function () {
        $("#menu").hide();
    })

    toUser = function(url){
        showMenu();

    }

    toShoppingCar = function(url){
        hiedMenu();
        createIframe(url);
    }
    createIframe = function(url){
        $("#window").html("<iframe src='"+url+"' style='width:99%; height:99%'></iframe>");
    }
</script>
</html>