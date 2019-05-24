package org.bs.front.conf;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900625986";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCbD/iC6YAeFEgLCZhnn/USVphBRxuUOviPiFEnqRgPQyu/n/B0ABGJQLmNAyKUCtD89IBtu5a9nSK4Rf7EaQRm3qIwNavz8+VUy6ZzC/xE+Sj2TYpEYta3B97pqMqXuQUKM5DImuMd3KYxt1Wtk2hCa72lRL0U384oLdDvpqgKV7X6kC7TaGNUQFY4guU1Q8GHUXoRPg3GtNiqasX+NsUf3GnFNvFhX4QvASu44ztOVVqFJgDAGpClCz6Sx4zro6BABoUrya1FogVw67u9x+IEI3eQv3n42oY8Gjk2ypQxU7Vamo6dFjKjoclMzlsMS95sdefMk5rnRUtHfAHI1NFTAgMBAAECggEBAJa5t37JKlgSrtTLxvEzcy0YL3eEfzJfAC3E+93paBGt4WCrPzgCuQkJeVOwsHPm765ynEQODEDT9WPZ5gNVcYns7wqdoT/I3CrIqks6Y0VITKDeToCa8suHQw8tm4BPwK5h4WKd7Bai3ImHBCltF/M4d2emoYUg52v23RmWjdE+VkM2GpKvFoH3VOQkk94FJUjMhThRlEkHP039grfbItvpeJua7lo0r1m/Uks96c+kPfM3a80poy+c106+Gb3DmuPgqhnjMIVG8sBmYO9snZ+lSFNUltsaa9J6FcEsiOgZ+Ps9fQpkhUhTzonCQxT+VnZil0dxWuEOZHMh/zJDmcECgYEA8lkLoyu+45bFLtaJ7O4J+Czr4Ael62ep0OjzV06qpnHLV1vg1rrFeBn5GaOK9t7T0sRnOO6grII3vavVWHWXPP/bbJSgeucXiZcdhahFPtOIWpUFxQhkhcQxLNRJYhb9ux2nXqxKkgbF96bJIELycmWsP4hkSeN6Lx5vVbsBHz8CgYEAo8wpWT4cfXQP6RCItOJWzbOR8VV4UhoBctqm2U0mGeTEL62zz0YMCknCvehmbLIPxAisI2Q2icsPZp9MDv4MSeMuGBDaxsQJV6dsicaglGqfY5yLqT0Is1sthi7dW45ZUQz9gYCXGQWw7+kD3CTOfl1LrQxfReG17x0pJX6gHO0CgYEAoULBbKVaUyTrNryJcMAAoER7/En6jQcgx6OK8QimozTLYuj/VsNXTRCzYe0iNh2WBASuzwJypffMUYi64S72IR/7iWfo1X9aeTK18U9ELIcjj2rkOPTZtu0S78qevgegdNdJnMS2pi6doqo34SDLJXYkRO5kFYqprhrpaLmUCI8CgYAibZQ3VM3KNK3vb/E8C+Lw45CGaE+c+ihZysmNHSEoCiSOXPVRWMjJFM3g+sskh5y2uJft7G9mMQ8wo8Tp1c4hbaXPmyNQ6f2ItgEjSGOSLoMH/eyBCvocMMr1zD3ss5PkbFWQdcXMlZymIJUWHYpllxiD6/jOiG2kL73pSp8+1QKBgQCKngE46JFahGihXEu3K8qZ0erhGDSANpIMg/KSVGGjAc4adzw49ZjuUJJYzWvbRkFkAsf93Pz/gmBSh7n0oj6/X8z+u7InDZClkZ4Jar8h63c6C3ikuZl4h9v+asfb2v3hN7HYXwfAwK8FF/8ctCrEKHy5AQ6Tin3Lfrrv7air+g==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmw/4gumAHhRICwmYZ5/1ElaYQUcblDr4j4hRJ6kYD0Mrv5/wdAARiUC5jQMilArQ/PSAbbuWvZ0iuEX+xGkEZt6iMDWr8/PlVMumcwv8RPko9k2KRGLWtwfe6ajKl7kFCjOQyJrjHdymMbdVrZNoQmu9pUS9FN/OKC3Q76aoCle1+pAu02hjVEBWOILlNUPBh1F6ET4NxrTYqmrF/jbFH9xpxTbxYV+ELwEruOM7TlVahSYAwBqQpQs+kseM66OgQAaFK8mtRaIFcOu7vcfiBCN3kL95+NqGPBo5NsqUMVO1WpqOnRYyo6HJTM5bDEvebHXnzJOa50VLR3wByNTRUwIDAQAB";

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
