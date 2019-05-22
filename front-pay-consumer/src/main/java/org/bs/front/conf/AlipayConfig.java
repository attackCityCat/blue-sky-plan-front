package org.bs.front.conf;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900625986";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC4OkHwUFzI9HRJz+Qp/hsVQOgMUbM1zM4frw1TZDb7+rR4+Z4O2WXxepS/x6NQpxV0VoJ0Z14kklR3AEohtDq7I5mEG6FFPaexjeF2NE56fc0OX3OvGgTDxPRa0Pe4SbpIu7SXcYTTw3KTowPUdSR+PmxL65/wH5aMcVz9ERy52TQGl5oEbiv5I2T8JHMx9HPShTytvLc97GA6519isdc392li+xUtELEjJPuNGmtt/8BaXBJL3vmhGA3NfNF5oQzrVu8YOuo0Bl7StucNpraBz62qQLJLIlLtWWbM5/hBuMmPtflCnSKj+6gQCTofG8OWPMOPgHN6UMrljWmphqI7AgMBAAECggEAbtv3w/HH89FOjQBBz5cumvqE6KzdR5mny98eCLl8cOMraMTk/RCLTOWzzzgGKclxmqFYPU3ak+1OUJHnCiMXWHeSsLGjuTPhznGPY/8T3pgHJggAaDUi+t9xH5kyCD6tj4kMojlYccniD79/1YBsZl+P8ZunkeqgQIETMOH0REzPb40ak0jawvSjMINYGnq85QpkvGHMUAhUTvQJtsWn+uDHNGQHTyR4o8G8NU/shiMidurCeamXLIMpYsoESau8ReAwFU6Msri5nbijnf2RX6N8b97COTeBmxLsqH5lvF8cDXkD9EM2QwOCZRIo6VQD1+Fw/uNOhg7YRq5x/AdnCQKBgQDiVnfMin4iKMDUWRgAh32g2cApgQwEkXe/RvP7VCNT/ErJCLc6TMrofxyHhGjy5pCmo6p62glT7CmtMvqIcjzHtb2oVdSzxvUkXGeHV4h/aT3wAAaRmO6NI6+Or1lZL+Bz5LGL0drSoPzPT9ivMp8Z9eaFl9B4VI7lPNYGbmuZvQKBgQDQXwLYBbNRW0jgsaaWf9YdbDQzuUbaCdRoF91/ZKszF/4rngU6bYhap/ONIRfrKonLp5Y8AtNFw4IzDCaReXvY7ETvMbI0/VxyuEy0J0s2BF58DEPP7kFwJl6kuiKO4BBTj6E5QtTf2+FISBiDAfRSxcOl+f8TXvNQTwvjTW2fVwKBgFObn1tWWWui5EBMvPoNEtIlPb/XJKpXVgW5Xw0bMoWmr7V9W7nUfivOMKq6tc3sb8iusp35BvMSTP7m0vcuQ9d+AhY5xn22Y/3PiIrNQeXW6YNLbyG/fXdzlDk/+uBgOCh3dUJx/cRKpbirBR8Kswzy8fmtb9vTWInDpEfx6Bt9AoGASYI7LppUOE9L1njVnCJdFuQlRloGdMUi+dXxfg+1lcDRGfIVRhd+Ev1NHmyeU4geNIpapbEZd3MRa5DNymRhHJW9e+S8SZVYF+CMrsFt9xBzhK+O/LvAuh/PI63Go0DIgbIZ3mmFT7PyNd25R/5YgxrhepxHMD4++AXq27VlBuECgYB3VLHFeliR9qZF1xeoZOI2JFlBgxWZ1CU2eZwF7owEIdq3sHMxOcqPqjJvF5RwX+ty344OYkUsObdqSkrfRmM2RblHmra+mNSGFz5l5PYIbQYDUeJs3P1ToVHRdW8SrvPnNM9s1CpP2cpY0oR1Vt6EVajxuGttqOlzVqZ2k8kpUA==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuDpB8FBcyPR0Sc/kKf4bFUDoDFGzNczOH68NU2Q2+/q0ePmeDtll8XqUv8ejUKcVdFaCdGdeJJJUdwBKIbQ6uyOZhBuhRT2nsY3hdjROen3NDl9zrxoEw8T0WtD3uEm6SLu0l3GE08Nyk6MD1HUkfj5sS+uf8B+WjHFc/REcudk0BpeaBG4r+SNk/CRzMfRz0oU8rby3PexgOudfYrHXN/dpYvsVLRCxIyT7jRprbf/AWlwSS975oRgNzXzReaEM61bvGDrqNAZe0rbnDaa2gc+tqkCySyJS7VlmzOf4QbjJj7X5Qp0io/uoEAk6HxvDljzDj4BzelDK5Y1pqYaiOwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8088/order/cashier";

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
