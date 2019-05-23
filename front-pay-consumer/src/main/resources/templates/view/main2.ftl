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
<body>
<script type="text/javascript">
    //初始化查询图片
    $(function(){
        queryImg();
    });

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