<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>个人中心-个人资料</title>

    <link rel="icon" href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css">
    <script src="/js/html5.js"></script>
    <script src="/js/jquery.js"></script>

    <script>
        $(document).ready(function(){
            $("nav .indexAsideNav").hide();
            $("nav .category").mouseover(function(){
                $(".asideNav").slideDown();
            });
            $("nav .asideNav").mouseleave(function(){
                $(".asideNav").slideUp();
            });
        });
    </script>

    <style>
        span {color: red}
    </style>
</head>
<body>
<!--header-->
<header>
    <!--topNavBg-->
    <div class="topNavBg">
        <div class="wrap">
            <!--topLeftNav-->
            <ul class="topLtNav">
                <li><a href="/page/toLogin" class="obviousText">你好!</a></li>
                <li><a href="">欢迎</a></li>
                <li><a href="">${user.name}</a></li>
            </ul>
            <!--topRightNav-->
            <ul class="topRtNav">
                <li><a href="">个人中心</a></li>
                <li><a href="" class="cartIcon">购物车<i>0</i></a></li>
                <li><a href="" class="favorIcon">收藏夹</a></li>
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
            <h1><img src="/img/lantian.png"></h1>
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
    <!--nav-->
    <nav>
        <ul class="wrap navList">
            <li class="category">
                <a>全部产品分类</a>
                <dl class="asideNav indexAsideNav" style="display: none;">
                    <dt><a href="">女装</a></dt>
                    <dd>
                        <a href="">夏装新</a>
                        <a href="">连衣裙</a>
                        <a href="">T恤</a>
                        <a href="">衬衫</a>
                        <a href="">裤子</a>
                        <a href="">牛仔裤</a>
                        <a href="">背带裤</a>
                        <a href="">短外套</a>
                        <a href="">时尚外套</a>
                        <a href="">风衣</a>
                        <a href="">毛衣</a>
                        <a href="">背心</a>
                        <a href="">吊带</a>
                        <a href="">民族服装</a>
                    </dd>
                    <dt><a href="">男装</a></dt>
                    <dd>
                        <a href="">衬衫</a>
                        <a href="">背心</a>
                        <a href="">西装</a>
                        <a href="">POLO衫</a>
                        <a href="">马夹</a>
                        <a href="">皮衣</a>
                        <a href="">毛衣</a>
                        <a href="">针织衫</a>
                        <a href="">牛仔裤</a>
                        <a href="">外套</a>
                        <a href="">夹克</a>
                        <a href="">卫衣</a>
                        <a href="">风衣</a>
                        <a href="">民族风</a>
                        <a href="">原创设计</a>
                        <a href="">大码</a>
                        <a href="">情侣装</a>
                        <a href="">开衫</a>
                        <a href="">运动裤</a>
                        <a href="">工装裤</a>
                    </dd>
                </dl>
            </li>
            <li>
                <a href="/page/toUser" class="active">首页</a>
            </li>
            <li>
                <a href="">时尚搭配</a>
            </li>
            <li>
                <a href="">原创设计</a>
            </li>
            <li>
                <a href="">时尚代购</a>
            </li>
            <li>
                <a href="">民族风</a>
            </li>
            <li>
                <a href="">时尚搭配</a>
            </li>
            <li>
                <a href="">搭配知识</a>
            </li>
            <li>
                <a href="">促销专区</a>
            </li>
            <li>
                <a href="">其他</a>
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

<section class="wrap user_center_wrap">
    <!--左侧导航-->
    <aside class="user_aside_nav">
        <dl>
            <dt>控制面板</dt>
            <dd><a href="/page/toMeans">个人资料</a></dd>
            <dd><a href="/page/toModify">修改密码</a></dd>
            <dd><a href="">我的地址</a></dd>
        </dl>
        <dl>
            <dt>商家管理中心</dt>
            <dd><a href="/page/toCommodity">商品列表</a></dd>
            <dd><a href="">订单列表</a></dd>
        </dl>
        <dl>
            <dt>买家中心</dt>
            <dd><a href="">我的订单</a></dd>
            <dd><a href="">我的询价单</a></dd>
            <dd><a href="">我的收藏</a></dd>
        </dl>
    </aside>
    <!--右侧：内容区域-->
    <div class="user_rt_cont">
        <div class="top_title">
            <strong>个人资料基础信息</strong>
        </div>
        <from id="userFrom">
        <table class="order_table">
            <tbody>
            <tr>
                <td width="80" align="right">昵称：</td>
                <td><input type="text" class="textbox" id="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td width="80" align="right">手机号码：</td>
                <td><input type="text" class="textbox" id="phone" value="${user.phone}" readonly></td>
            </tr>
            <tr>
                <td width="80" align="right">电子邮箱：</td>
                <td><input type="text" class="textbox textbox_225" id="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td width="80" align="right">创建日期：</td>
                <td><input type="text" class="textbox textbox_225" id="createTime" value="${user.createTime}" readonly ></td>
            </tr>
            <tr>
                <td width="80" align="right"></td>
                <td><input type="button" class=" group_btn" value="更新保存" id="genxin"></td>
            </tr>
            </tbody>
        </table>
            <input type="hidden" id="userId" value="${user.userId}">
        </from>
    </div>
</section>
<script type="text/javascript">
    $("#genxin").click(function(){
          $.ajax({
              url:"/users/userFrom",
              type:"put",
              data:{
                 name:$("#name").val(),
                 email:$("#email").val(),
                 userId:$("#userId").val()
              },
              dataType:"json",
              success:function(data){
                  if(data){
                      alert("保存成功");
                  }
              }
          })
    })

</script>
<!--footer-->
<footer>
    <!--help-->
    <ul class="wrap help">
        <li>
            <dl>
                <dt>消费者保障</dt>
                <dd><a href="">保障范围</a></dd>
                <dd><a href="">退换货流程</a></dd>
                <dd><a href="">服务中心</a></dd>
                <dd><a href="">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>新手上路</dt>
                <dd><a href="">保障范围</a></dd>
                <dd><a href="">退换货流程</a></dd>
                <dd><a href="">服务中心</a></dd>
                <dd><a href="">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>付款方式</dt>
                <dd><a href="">保障范围</a></dd>
                <dd><a href="">退换货流程</a></dd>
                <dd><a href="">服务中心</a></dd>
                <dd><a href="">更多服务特色</a></dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>服务保障</dt>
                <dd><a href="">保障范围</a></dd>
                <dd><a href="">退换货流程</a></dd>
                <dd><a href="">服务中心</a></dd>
                <dd><a href="">更多服务特色</a></dd>
            </dl>
        </li>
    </ul>
    <div class="wrap btmInfor">
        <p>© 2013 DeathGhost.cn 版权所有 网络文化经营许可证：浙网文[2013]***-027号 增值电信业务经营许可证：浙B2-200***24-1 信息网络传播视听节目许可证：1109***4号</p>
        <address>联系地址：北京市海淀区西三旗悦秀路金科教育 1810A 班</address>
    </div>
</footer>
</body>
</html>