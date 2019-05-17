<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/jquery.js"></script>
</head>
<body>

    <#list list as i>
        <br>
        订单编号：${i.order_no}
        <br>
        商品名称：${i.order_name}
        <br>
        商品店铺：${i.order_shop}
        <br>
        订单类型：${i.order_type}
        <br>
        下单时间：${i.order_createTime}
        <br>
        商品单价：${i.order_onePrice}
        <br>
        商品总价：${i.order_countPrice}
        <br>
        收货地址：${i.order_city}
        <br>
        <#if i.order_status=0>
            订单状态：待付款

        <#elseif i.order_status=1>
            订单状态：已付款
        <#elseif i.order_status=2>
            订单状态：失效订单
        </#if>
        <br>

    </#list>

<script type="text/javascript">

</script>
</body>
</html>