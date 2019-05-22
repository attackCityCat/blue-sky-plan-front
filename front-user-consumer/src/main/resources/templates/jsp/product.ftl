<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>产品详情</title>
    <meta name="keywords" content="DeathGhost"/>
    <meta name="description" content="DeathGhost"/>
    <meta name="author" content="DeathGhost,deathghost@deathghost.cn">
    <link rel="icon" href="images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/js/style.css"/>
    <script src="/js/html5.js"></script>
    <script src="/js/jquery.js"></script>
    <script src="/js/jquery.jqzoom.js"></script>
    <script src="/js/base.js"></script>

    <style>
        .product_detail .rt_infor .goods_infor .horizontal_attr dd .istrue {
            border: 1px #ff0000 solid;
        }
    </style>
</head>
<body>

<!--导航指向-->

<section class="wrap product_detail">
    <!--img:left-->
    <div class="gallery">
        <div>
            <div id="preview" class="spec-preview"><span class="jqzoom"><img jqimg="${pro.img}"
                                                                             height="420px" width="420px"
                                                                             src="${pro.img}"/></span></div>
            <!--缩图开始-->
            <div class="spec-scroll"><a class="prev">&lt;</a> <a class="next">&gt;</a>
                <div class="items">
                    <ul>
                        <#list img as img>
                            <li><img bimg="upload/goods.jpg" src="${img}" onmousemove="preview(this);"></li>
                        </#list>
                    </ul>
                </div>
            </div>
            <!--缩图结束-->
        </div>
    </div>
    <!--text:right-->
    <div class="rt_infor">
        <!--lt_infor-->
        <div class="goods_infor">
            <#--//商品id // 商品标题 // 商品价格 //商品图  //商品规格 //商品颜色 //商品数量-->
            <form action="/page/addShopCar" id="addShopCarFrom">
                <input type="hidden" value="${pro.id}" id="productId" name="productId">
                <input type="hidden" value="${pro.productTitle}" id="productName" name="productName">
                <input type="hidden" value="${pro.productPrice}" id="productPrice" name="productPrice">
                <input type="hidden" value="${pro.img}" id="productImg" name="productImg">
                <input type="hidden" value="" id="productCount" name="productCount">
                <input type="hidden" value="" id="productColor" name="productColor">
                <input type="hidden" value="" id="productSpec" name="productSpec">
            </form>
            <h2>${pro.productTitle}</h2>
            <ul>
                <li>
                    <dl class="horizontal">
                        <dt>价格：</dt>
                        <dd><strong class="rmb_icon univalent">${pro.productPrice}</strong>元</dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal">
                        <dt>上架时间：</dt>
                        <dd>
                            <time>${pro.shelfTime}</time>
                        </dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal">
                        <dt>品牌：</dt>
                        <dd><em>${pro.brandName}</time></em>
                    </dl>
                </li>
                <li class="statistics">
                    <dl class="vertical">
                        <dt>月销量</dt>
                        <dd>${pro.productSales}</dd>
                    </dl>
                    <dl class="vertical">
                        <dt>累计评论</dt>
                        <dd>${pro.productComments}</dd>
                    </dl>
                    <dl class="vertical">
                        <dt>关注</dt>
                        <dd>${pro.productConcern}</dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal horizontal_attr">
                        <dt>规格：</dt>
                        <dd>
                            <label id="color00"><input type="radio" name="guige" value="S码" onclick="checkColor1()"/>S码</label>
                            <label id="color01"><input type="radio" name="guige" value="M码" onclick="checkColor1()"/>M码</label>
                            <label id="color02"><input type="radio" name="guige" value="L码" onclick="checkColor1()"/>L码</label>
                            <label id="color03"><input type="radio" name="guige" value="XL码" onclick="checkColor1()"/>XL码</label>
                            <label id="color04"><input type="radio" name="guige" value="XXL码" onclick="checkColor1()"/>XXL码</label>
                        </dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal horizontal_attr">
                        <dt>颜色：</dt>
                        <dd>
                            <label id="color0"><input type="radio" name="yanse" value="黑色"
                                                      onclick="checkColor()"/>黑色</label>
                            <label id="color1"><input type="radio" name="yanse" value="蓝色"
                                                      onclick="checkColor()"/>蓝色</label>
                            <label id="color2"><input type="radio" name="yanse" value="白色"
                                                      onclick="checkColor()"/>白色</label>
                        </dd>
                    </dl>
                </li>
                </li>
                <li>
                    <dl class="horizontal horizontal_attr">
                        <dt>数量：</dt>
                        <dd>
                            <input type="button" value="-" class="jj_btn" onclick="reduce()"/>
                            <input type="text" value="1" readonly class="num" id="procount"/>
                            <input type="button" value="+" class="jj_btn" onclick="puls()"/>
                            <span>库存：${pro.productStock}</span>
                        </dd>
                    </dl>
                </li>
                <li class="last_li">
                    <input type="button" value="立即询价" class="buy_btn" onClick="alert('询价请求已推送至商家，请耐心等待！');"/>
                    <input type="button" value="立即购买" class="buy_btn" onclick="purchase(${pro.productPrice})"/>
                    <input type="button" value="加入购物车" class="add_btn" onclick="addShopCar()"/>
                </li>
            </ul>
        </div>
        <!--rt_infor-->
        <div class="shop_infor">
            <dl class="business_card">
                <dt>蓝天小组有限公司</dt>
                <dd>资质：生产商</dd>
                <dd>联系人：梁先生（先生）</dd>
                <dd>邮件：llpbzgc@163.com</dd>
                <dd>电话：18903100844</dd>
                <dd>所在地：北京市海定区</dd>
                <dd>地址：河北邯郸</dd>
                <dd class="center">
                    <a href="#" class="link_btn">进入店铺</a>
                    <a class="#">收藏店铺</a>
                </dd>
            </dl>

        </div>
    </div>
</section>
<!--detail-->
<section class="wrap product_detail_btm">
    <article>
        <ul class="item_tab">
            <li><a class="curr_li" name="check" onclick="check(this)">商品详情</a></li>
            <li><a name="check">商品评价（2893）</a></li>
            <li><a name="check">成交记录（1892）</a></li>
        </ul>
        <!--商品详情-->

        <div class="cont_wrap active">
            该店铺参与了公益宝贝计划，卖家承诺每笔成交将为壹乐园计划捐赠0.02元。该商品已累积捐赠24560笔。
            善款用途简介：基于游戏教育在儿童成长中的重要性，壹基金设立了“壹乐园计划”，帮助提供滑梯、攀爬架、跷跷板、秋千、乒乓球桌等，为灾后及贫困地区的孩子们搭建课<br/>
            该商品参与了公益宝贝计划，卖家承诺每笔成交将为壹乐园计划捐赠0.02元。该商品已累积捐赠24560笔。
            善款用途简介：基于游戏教育在儿童成长中的重要性，壹基金设立了“壹乐园计划”，帮助提供滑梯、攀爬架、跷跷板、秋千、乒乓球桌等，为灾
            最终解释权归：蓝天小组所有！
            <#list img as img>
                <img src="${img}"/><br/>
            </#list>
            该商品参与了公益宝贝计划，卖家承诺每笔成交将为壹乐园计划捐赠0.02元。该商品已累积捐赠24560笔。
            善款用途简介：基于游戏教育在儿童成长中的重要性，壹基金设立了“壹乐园计划”，帮助提供滑梯、攀爬架、跷跷板、秋千、乒乓球桌等，为灾后及贫困地区的孩子们搭建课<br/>
            该商品参与了公益宝贝计划，卖家承诺每笔成交将为壹乐园计划捐赠0.02元。该商品已累积捐赠24560笔。
            善款用途简介：基于游戏教育在儿童成长中的重要性，壹基金设立了“壹乐园计划”，帮助提供滑梯、攀爬架、跷跷板、秋千、乒乓
        </div>
        <!--商品评价-->
        <div class="cont_wrap">
            <table class="table">
                <tr>
                    <td width="20%" align="center">李*锋</td>
                    <td width="60%">这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦</td>
                    <td width="20%" align="center">
                        <time>2013-01-13 15:06</time>
                    </td>
                </tr>
                <tr>
                    <td width="20%" align="center">彭**法</td>
                    <td width="60%">这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦</td>
                    <td width="20%" align="center">
                        <time>2013-01-13 15:06</time>
                    </td>
                </tr>
                <tr>
                    <td width="20%" align="center">代**彭</td>
                    <td width="60%">
                        这里是评论内容哦这里是评论内容哦这里是评论内容哦容哦这里是评论内容哦这里是评论内容哦这里是评论容哦这里是评论内容哦这里是评论内容哦这里是评论容哦这里是评论内容哦这里是评论内容哦这里是评论容哦这里是评论内容哦这里是评论内容哦这里是评论容哦这里是评论内容哦这里是评论内容哦这里是评论容哦这里是评论内容哦这里是评论内容哦这里是评论容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦这里是评论内容哦
                    </td>
                    <td width="20%" align="center">
                        <time>2013-01-13 15:06</time>
                    </td>
                </tr>
            </table>
            <!--分页-->
            <div class="paging">
                <a>第一页</a>
                <a class="active">2</a>
                <a>3</a>
                <a>...</a>
                <a>89</a>
                <a>最后一页</a>
            </div>
        </div>
        <!--成交记录-->
        <div class="cont_wrap">
            <table class="table">
                <tr>
                    <th>买家</th>
                    <th>产品属性</th>
                    <th>数量</th>
                    <th>成交时间</th>
                </tr>
                <tr>
                    <td align="center">李**强</td>
                    <td>
                        <p>颜色：黑色
                        <p>
                        <p>规格：M
                        <p>
                    </td>
                    <td align="center"><b>1</b></td>
                    <td align="center">
                        <time>2013-01-13 15:25:39</time>
                    </td>
                </tr>
                <tr>
                    <td align="center">李**强</td>
                    <td>
                        <p>颜色：黑色
                        <p>
                        <p>规格：L
                        <p>
                    </td>
                    <td align="center"><b>1</b></td>
                    <td align="center">
                        <time>2013-01-13 15:25:39</time>
                    </td>
                </tr>
                <tr>
                    <td align="center">葛**华</td>
                    <td>
                        <p>颜色：白色
                        <p>
                        <p>规格：XL
                        <p>
                    </td>
                    <td align="center"><b>5</b></td>
                    <td align="center">
                        <time>2013-01-13 15:25:39</time>
                    </td>
                </tr>
            </table>
            <!--分页-->
            <div class="paging">
                <a>第一页</a>
                <a class="active">2</a>
                <a>3</a>
                <a>...</a>
                <a>89</a>
                <a>最后一页</a>
            </div>
        </div>
    </article>
    <aside>
        <dl class="aside_pro_list">
            <dt>
                <strong>精品推荐</strong>
                <a>更多</a>
            </dt>
            <#--数据库加载4条销量最好的数据-->
            <#list list as g>
                <dd>
                    <a href="#" class="goods_img"><img src="${g.img}"/></a>
                    <div class="rt_infor">
                        <h3><a href="#">${g.productTitle}</a></h3>
                        <p>
                            <del class="rmb_icon">999999999</del>
                        </p>
                        <p><strong class="rmb_icon">${g.productPrice}</strong></p>
                    </div>
                </dd>
            </#list>
        </dl>
    </aside>
</section>

<script>

    function accAdd(arg1, arg2) {
        var r1, r2, m;
        try {
            r1 = arg1.toString().split(".")[1].length
        } catch (e) {
            r1 = 0
        }
        try {
            r2 = arg2.toString().split(".")[1].length
        } catch (e) {
            r2 = 0
        }
        m = Math.pow(10, Math.max(r1, r2))
        return ((arg1 * m + arg2 * m) / m).toFixed(2);
    }


    //点击商品减少操作
    function reduce() {
        var count = $("#procount").val();
        if (count <= 1) {
            return;
        }
        count = count <= 1 ? 1 : --count;
        $("#procount").val(count);
    }

    function puls() {
        var count = $("#procount").val();
        $("#procount").val(++count);
    }

    //精确计算乘法
    function accMul(arg1, arg2) {
        var m = 0, s1 = arg1.toString(), s2 = arg2.toString();
        try {
            m += s1.split(".")[1].length
        } catch (e) {
        }
        try {
            m += s2.split(".")[1].length
        } catch (e) {
        }
        return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m)
    }

    //立即购买 点击时直接跳转到支付页
    function purchase(price) {
        $("#productCount").val($("#procount").val())
        var count = $("#productCount").val();
        var ids = $("#productId").val();
        //计算出商品的总价
        var totalPrice = (price, count);
        //跳转到收银台页面  totalPrice总价 ids 商品的id
        location.href = "/路径/路径?totalPrice=" + totalPrice + "&ids?=" + ids;
    }

    //添加商品到购物车
    function addShopCar() {
        //商品规格
        var productSpec = "";
        var arr = document.getElementsByName("guige")
        for (var i = 0; i < arr.length; i++) {
            if (arr[i].checked) {
                productSpec = arr[i].value;
            }
        }
        //商品颜色
        var productColor = "";
        var arr = document.getElementsByName("yanse")
        for (var i = 0; i < arr.length; i++) {
            if (arr[i].checked) {
                productColor = arr[i].value;
            }
        }
        $("#productColor").val(productColor)
        var a = $("#productColor").val();
        if (a == null || a == '') {
            alert("请选则颜色");
            return;
        }
        $("#productCount").val($("#procount").val())
        $("#productSpec").val(productSpec);
        var b = $("#productSpec").val();
        if (b == null || b == '') {
            alert("请选中规格");
            return;
        }
        $("#addShopCarFrom").submit();
    }

    function checkColor() {
        var arr = document.getElementsByName("yanse");
        for (var i = 0; i < arr.length; i++) {
            var obj = document.getElementById("color" + i);
            if (arr[i].checked) {
                obj.classList.add('istrue');
            } else {
                obj.classList.remove('istrue');
            }
        }
    }

    function checkColor1() {
        var arr = document.getElementsByName("guige");
        for (var i = 0; i < arr.length; i++) {
            var obj = document.getElementById("color0" + i);
            if (arr[i].checked) {
                obj.classList.add('istrue');
            } else {
                obj.classList.remove('istrue');
            }
        }
    }

</script>

</body>
</html>
