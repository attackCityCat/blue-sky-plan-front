<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>收银台页面</title>
    <link rel="icon" href="images/icon/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="/style.css"/>
    <script src="/html5.js"></script>
    <script src="/jquery.js"></script>
</head>
<body>
<section class="wrap" style="margin-top:20px;overflow:hidden;">
    <table class="order_table">
        <caption>
            <strong>订单商品</strong>
            <a href="javascript:shopPingCar()">返回购物车修改</a>
        </caption>
        <#list list as i>
            <tr>
                <td class="center"><img src="upload/goods.jpg" style="width:50px;height:50px;"/></a></td>
                <td>${i.productName}

                </td>
                <td>
                    <p>颜色：${i.productColor}</p>

                    <p>规格：${i.productSpec}</p>
                </td>
                <td class="center"><span class="rmb_icon">${i.productPrice}</span></td>
                <td class="center"><span>${i.productCount}</span></td>
                <td class="center"><strong class="rmb_icon">${i.productPrice*i.productCount}</strong></td>
            </tr>
        </#list>

    </table>

    <!--支付与配送-->
    <ul class="order_choice">
        <li>
            <dl>
                <dt>支付方式</dt>
                <dd>
                    <label class="radio istrue"><input type="radio" name="pay"/>支付宝</label>
                </dd>
                <dd>
                    <#--                    <label>
                                            <input type="checkbox"/>
                                            使用余额￥<input type="text" value="59.00" class="textbox"/>
                                            <mark>当前账户余额<strong class="rmb_icon">59.00</strong></mark>
                                        </label>-->
                </dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>配送方式（可多选）</dt>
                <dd>
                    <label class="radio" id="x0"><input type="radio" name="peisong" onclick="checkSend()"/>物流</label>
                    <label class="radio" id="x1"><input type="radio" name="peisong" onclick="checkSend()"/>自配送</label>
                    <label class="radio" id="x2"><input type="radio" name="peisong" onclick="checkSend()"/>快递</label>
                </dd>
                <dd>
                    <textarea value="">北京市 海定区 西三旗 明园大学           暂时写死 </textarea>
                </dd>
            </dl>
        </li>
        <li>
            <dl>
                <dt>订单留言</dt>
                <dd>
                    <textarea></textarea>
                </dd>
            </dl>
        </li>
    </ul>
    <div class="order_btm_btn">
        <input type="hidden" value="${totalPrice}" id="totalPrice">
        <input type="hidden" value="${ids}" id="ids">
        <a href="javascript:payManey()" class="link_btn_02 add_btn"/>共计金额<strong class="rmb_icon">${totalPrice}</strong>提交订单</a>
    </div>
</section>

<script type="text/javascript">

    //结账且删除购物车
    function payManey(){

        $.ajax({
            url:'/order/addOrder',
            type:'post',
            data:{
                ids:$("#ids").val(),
                price:$("#totalPrice").val()
            },
            success:function(){
                location.href="/order/goAlipay?price="+$("#totalPrice").val();
            }
        })
    }


    //用户点击返回i购物车时的操作
    function shopPingCar() {
        location.href = "/page/test";
    }

    //点击选择配送方式的操作
    checkSend = function (){
        var arr = document.getElementsByName("peisong");
        for (var i = 0;i < arr.length;i++) {
            if (arr[i].checked){
                $("#x"+i).addClass('istrue');
            }else {
                $("#x"+i).removeClass('istrue');
            }
        }
    }





</script>

</body>
</html>