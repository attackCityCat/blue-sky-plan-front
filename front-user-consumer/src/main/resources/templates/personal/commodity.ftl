<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>个人中心-商品列表</title>
    <link rel="icon" href="http://demo.demohuo.top/modals/57/5750/demo/images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css">
    <script src="/js/html5.js"></script>

    <script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/js/bootstrap3/css/bootstrap.css"/>

    <link rel="stylesheet" href="/js/bootstrap-table/bootstrap-table.css">
    <script src="/js/bootstrap-table/bootstrap-table.js"></script>
    <script src="/js/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>

    <script src="/js/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
    <script src="/js/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <link rel="stylesheet" href="/js/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css">

    <script src="/js/bootstrap-bootbox/bootbox.all.min.js"></script>

    <script type="text/javascript" src="/js/area.js"></script>
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
                        <input type="text" placeholder="输入产品关键词或货号" style="height: 35px">
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
            <dd><a href="" id="wu">我的订单</a></dd>
            <dd><a href="" id="wu">我的询价单</a></dd>
            <dd><a href="" id="wu">我的收藏</a></dd>
        </dl>
    </aside>
    <!--右侧：内容区域-->
    <div class="user_rt_cont">
        <div class="top_title">
            <strong>商品列表</strong>
        </div>
        <div class="table" id="userTable">
        </div>
    </div>

</section>

<script type="text/javascript">
    $(function(){
        initTable();
    });

    function  initTable(){
        $('#userTable').bootstrapTable({
            url:'/users/queryProduct', //获取数据地址
            toolbar:'#toolbar',
            method:'get',
            pagination:true, //是否展示分页
            pageList:[4, 10, 20, 50],//分页组件
            pageNumber:1,
            pageSize:4,//默认每页条数
            columns:[
                { field:"id",title:"货号", width:100 },
                { field:"productTitle",title:"名称", width:300 },
                { field:"url",title:"图片", width:60,
                    formatter:function(value,row,index){
                        return "<img src='"+value+"' width='50px' height='50px'/>";
                    }
                },
                { field:"productPrice",title:"价格", width:100 },
                { field:"typeName",title:"类型", width:100 },
                { field:"shelfTime",title:"上架时间", width:200 },
                { field:"productSales",title:"销量", width:100 }
            ]
        })
    }
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