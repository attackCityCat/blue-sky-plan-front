<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery.min.js"></script>
</head>
<body>
<h1>这里是商品详情页</h1>
<input id="login" />
<input type="button" value="加入购物车" id="addCar"/>
<script type="text/javascript">
    $("#addCar").click(function () {
        var a = $("#login").val();
        if(a==''){
            alert("不要捣乱");
            return;
        }
        location.href="/page/addShopCar?a="+a;

    })

</script>
</body>
</html>