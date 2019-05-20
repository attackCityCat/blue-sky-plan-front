<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>个人中心-修改密码</title>
    <link rel="icon" href="http://www.17sucai.com/preview/183822/2019-05-11/shopping/images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css">
    <script src="/js/html5.js"></script>
    <script src="/js/jquery.js"></script>
    <script src="/js/swiper.min.js"></script>
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

<section class="wrap user_center_wrap">
    <!--右侧：内容区域-->
    <div class="user_rt_cont">
        <div class="top_title">
            <strong>修改密码</strong>
        </div>
        <table class="order_table">
            <tbody><tr>
                <td width="80" align="right">原始密码：</td>
                <td><input type="password" class="textbox"><mark class="tips_errors">这里是提示性或错误信息</mark></td>
            </tr>
            <tr>
                <td width="80" align="right">设置新密码：</td>
                <td><input type="password" class="textbox"><mark class="tips_errors">这里是提示性或错误信息</mark></td>
            </tr>
            <tr>
                <td width="80" align="right">确认新密码：</td>
                <td><input type="password" class="textbox"><mark class="tips_errors">这里是提示性或错误信息</mark></td>
            </tr>
            <tr>
                <td width="80" align="right"></td>
                <td><input type="button" class=" group_btn" value="修改密码"></td>
            </tr>
            </tbody></table>
    </div>
</section>
</body>
</html>