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


</head>
<body>

<!--导航指向-->
<aside class="wrap insideLink">
    <a href="index.html">首页</a>
    <a href="product_list.html">时尚女装</a>
</aside>
<section class="wrap product_detail">
    <!--img:left-->
    <div class="gallery">
        <div>
            <div id="preview" class="spec-preview"><span class="jqzoom"><img jqimg="${pro.img}"
                                                                             src="${pro.img}"/></span></div>
            <!--缩图开始-->
            <div class="spec-scroll"><a class="prev">&lt;</a> <a class="next">&gt;</a>
                <div class="items">
                    <ul>
                        <li><img bimg="upload/goods.jpg" src="${pro.img}" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods004.jpg" src="${pro.img}" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
                        <li><img bimg="upload/goods.jpg" src="upload/goodssmall.jpg" onmousemove="preview(this);"></li>
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
            <form id="shopFrom">
                <#--标题，价格-->
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
                            <time>${}</time>
                        </dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal">
                        <dt>品牌：</dt>
                        <dd><em>品牌名</time></em>
                    </dl>
                </li>
                <li class="statistics">
                    <dl class="vertical">
                        <dt>月销量</dt>
                        <dd>20</dd>
                    </dl>
                    <dl class="vertical">
                        <dt>累计评论</dt>
                        <dd>198</dd>
                    </dl>
                    <dl class="vertical">
                        <dt>关注</dt>
                        <dd>230</dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal horizontal_attr">
                        <dt>规格：</dt>
                        <dd>
                            <label><input type="radio" name="guige"/>S码</label>
                            <label><input type="radio" name="guige"/>M码</label>
                            <label><input type="radio" name="guige"/>L码</label>
                            <label><input type="radio" name="guige"/>XL码</label>
                            <label><input type="radio" name="guige"/>XXL码</label>
                        </dd>
                    </dl>
                </li>
                <li>
                    <dl class="horizontal horizontal_attr">
                        <dt>颜色：</dt>
                        <dd>
                            <label><input type="radio" name="yanse"/>黑色</label>
                            <label><input type="radio" name="yanse"/>蓝色</label>
                            <label><input type="radio" name="yanse"/>白色</label>
                        </dd>
                    </dl>
                </li>
                </li>
                <li>
                    <dl class="horizontal horizontal_attr">
                        <dt>数量：</dt>
                        <dd>
                            <input type="button" value="-" class="jj_btn"/>
                            <input type="text" value="1" readonly class="num"/>
                            <input type="button" value="+" class="jj_btn"/>
                            <span>库存：2580件</span>
                        </dd>
                    </dl>
                </li>
                <li class="last_li">
                    <input type="button" value="立即询价" class="buy_btn" onClick="alert('询价请求已推送至商家，请耐心等待！');"/>
                    <input type="button" value="立即购买" class="buy_btn" onClick="javascript:location.href='cart.html'"/>
                    <input type="button" value="加入购物车" class="add_btn"/>
                </li>
            </ul>
            </form>
        </div>
        <!--rt_infor-->
        <div class="shop_infor">
            <dl class="business_card">
                <dt>xx有限公司</dt>
                <dd>资质：生产商</dd>
                <dd>联系人：*先生（先生）</dd>
                <dd>邮件：******@Foxmail.com</dd>
                <dd>电话：4008-******</dd>
                <dd>所在地：陕西省西安市</dd>
                <dd>地址：陕西省西安市**区**街232号</dd>
                <dd class="center">
                    <a href="shop.html" class="link_btn">进入店铺</a>
                    <a class="link_btn">收藏店铺</a>
                </dd>
            </dl>

        </div>
    </div>
</section>
<!--detail-->
<section class="wrap product_detail_btm">
    <article>
        <ul class="item_tab">
            <li><a class="curr_li">商品详情</a></li>
            <li><a>商品评价（2893）</a></li>
            <li><a>成交记录（1892）</a></li>
        </ul>
        <!--商品详情-->
        <div class="cont_wrap active">
            该商品参与了公益宝贝计划，卖家承诺每笔成交将为壹乐园计划捐赠0.02元。该商品已累积捐赠24560笔。
            善款用途简介：基于游戏教育在儿童成长中的重要性，壹基金设立了“壹乐园计划”，帮助提供滑梯、攀爬架、跷跷板、秋千、乒乓球桌等，为灾后及贫困地区的孩子们搭建课<br/>
            该商品参与了公益宝贝计划，卖家承诺每笔成交将为壹乐园计划捐赠0.02元。该商品已累积捐赠24560笔。
            善款用途简介：基于游戏教育在儿童成长中的重要性，壹基金设立了“壹乐园计划”，帮助提供滑梯、攀爬架、跷跷板、秋千、乒乓球桌等，为灾
            <img src="upload/goods005.jpg"/><br/>
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

</body>
</html>
