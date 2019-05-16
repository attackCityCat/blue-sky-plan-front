/**
 * 购物车操作商品数量减
 * @param a
 * @param price
 */
function plus(a,price) {
    var count = $("#"+a).val();
    count = count <= 0 ? 0: --count;
    $("#"+a).val(count);
    $("#money"+a).html(count*price);
}

/**
 * 购物车操作商品增加
 * @param a
 * @param price
 */
function reduce(number,price) {
    var count = $("#"+number).val();
    $("#"+number).val(++count);
    $("#"+price).html(count*price);
}

/**
 * 购物车商品总价
 * @param a
 * @param price
 */
function updatetext(number,price) {
    var d = $("#"+number).val();
    $("#"+number).html(d*price)
}