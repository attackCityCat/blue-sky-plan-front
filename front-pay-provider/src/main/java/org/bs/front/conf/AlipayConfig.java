package org.bs.front.conf;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900625986";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBs69yMU0x2zLDIWv9LJ45BexWZ00IBSKeofCBoXan4NAdr4phQh77jWBaFjEe1w6kQjW8cWUJutifBUWqNukGlenJYcmdF+ggZBzJfSRhVp4ZZXU6uNc/S3V7fUeXUv4WN5Aiuz/39KPuvATYKPx9+acvEOmjnHwUN9EgyNmUaIXRGjvQkm0Daj/Jdf5U2++V62D3YUvJEB6SAb7cd18mX1za5rrvGX3gycamypYMLGEW/UQYuDBaBfLVX1piVQIIx7dg8ShV014+DEBKOPEnY4MzetjqD/pyEQEsP9lP+UeAiCun1DJek8ra/33/iA2u4E7bqKikQyOQL3hrVZCFAgMBAAECggEAV6WUNueoEbvdts0cC48eMMyW4+CUxomp1mb6fq8c3t9l49me+pBTHYxxAw+iDAQqCcgQRhKew493GSbX5+mJWQDvZj3ln3nrTBA6/9HIRtrgparRKGiGVGhqsJN9UH4t49eSWFYPKUExkn+OCoDP91VAq+aS7BQwKP17Hdt8ZPOywhZn1eiOt9BJDhG/u0JAr3PCKXy3uj2dE+RK71zRzxciLqjwUtMCSjyvArZen0yU4lR75eu8AJaLPcGfKCKXJ/+LPMCaFh8Z7/Pa6ov83Jpg0vux+WmMa7zP9r1XzPq5EnnIe2MlMnjaU2XiWLmuvUkUBH+l13zSi63EZOjQQQKBgQC5cn+1qnPPSi39jlUIZYRx3SYCupS3U9GitMWv7J7/fVzMraD2Ab2e0l9M9/auf4lYIHmEnpfZSclZp2yg8EAv7eyK6h0SrNiVfGauIQRz0FKQm32NOVkDInXlKehKlr3+/cKxPXQYKn16cessdVkseeEVwPwpdq08r5exvmLjlQKBgQCzC+g7PmDDpyXz3me+aFmxm+mJ7kKvdXY2KoL8XcA3UB+62vU08svfiOAfuwop9Rg9KUJjBBdSr4yeVXzGNdgtEaHaZaNkC4G8Ia3U/hVOrrVafuYvgQpDge9m7T3TUwwLfa93ZC/JJt3uuA0QxBj5jH3HcfMLqQSdes157he9MQKBgBVUeB/7FQr4q0WIw3sNwigemaqir0xO1cPzKvHLM5aLYssgBW2GUbsc011VAAieHrwGMDPy0eBqPkCTo0j3mUpqAVURDHsDan33KxBIN+ziPzzmxZAi0nwr0IelRFSf9gaIRYaBXQMSkBAvXi9k5/bXpe4MnnRedBqQz8/f6BvpAoGBAKA+AeQz2aqByAfQfwz8m3nHzmXx5aDfAaNMvNpclZFrllpHaLmwqyIugFglr90JTF5AtPelS7JnBvUWEYvb2NPNOgwadvctDTlw8wDzPeKjng+WDzFozeTJP5fgsDqX0und3NJ/yfy/WlUySA8/UhLV2CROKXXAGS9QHuIHYxuhAoGANlmsnK1d2rY9ZNjdnCUwxsse5UiPm6pNEPxxj/fj182FtD/J8q6HCyDRA1od1AjPfjvSZm7TDGMEcYKApGoZ2DMeuPM+LymmMRZsoBY2W2R/HE4acQGQIQcEdWtA8noQ9t5k4v2mrypVehwg7kTF3Cbxu3avJD08dSszUROGtKM=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgbOvcjFNMdsywyFr/SyeOQXsVmdNCAUinqHwgaF2p+DQHa+KYUIe+41gWhYxHtcOpEI1vHFlCbrYnwVFqjbpBpXpyWHJnRfoIGQcyX0kYVaeGWV1OrjXP0t1e31Hl1L+FjeQIrs/9/Sj7rwE2Cj8ffmnLxDpo5x8FDfRIMjZlGiF0Ro70JJtA2o/yXX+VNvvletg92FLyRAekgG+3HdfJl9c2ua67xl94MnGpsqWDCxhFv1EGLgwWgXy1V9aYlUCCMe3YPEoVdNePgxASjjxJ2ODM3rY6g/6chEBLD/ZT/lHgIgrp9QyXpPK2v99/4gNruBO26iopEMjkC94a1WQhQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://kyd.free.idcfengye.com/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
