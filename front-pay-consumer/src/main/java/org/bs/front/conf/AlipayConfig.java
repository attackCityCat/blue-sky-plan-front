package org.bs.front.conf;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900625986";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC6+hdr/9y1TRBW+lZGUSRb4PYpvwQkWSS0bxgvSYLzNs09TJWyhOFZgN/AwMJAZTdIVk1tVqG6G3qw7FTgLubuj7aTghybOxwgfrIx2AiTX7xHyCVi+pH1FQXG0j6sMVMz8IhrEQ+RhMtXzz5Ndp0NuktEOFgxxW2AwhUnCw6PaETTvlskPyyhlFjC6ls5BPV/GBVf+zXSSCNQkYz3pI5nddILes1X1WtFGes1tdjYxUvB69QtSkLm0etevlsDN2pDEP3TFXffo4vVTgA4mxEI0E0tSeOdx6mMY6jx3JEiknOOAY9iHllLM9HiwKmojOA2sxgMu387QWYjgGLo5cfFAgMBAAECggEBAJFWYOpkIi0TUAYr5PAXlomMngvpHNEcMbnHOSdYnt9q07I4W4w+WeR2lnZ/3v6rLoOeAeVhl6jQP1hS+86e5oa9Uw/p7U6EbeKcWOsBn/jeS74IR3deiiHVS342Ytz6IlCXQZLn2hAlBuKkhyszbfUDwAmxOmzFp86UDlkg8Rpqf+Ig3R5N109VkSdlRx4hoJDRvZI7JwoghpdMiwGPfE88ZcAHh3hN+9SakW8qdoy9IvlewdXozcS9npzm0lolmYlfjGqIRX0+25ZRcFlgZCAEEj7uKBrWYIWDhVSCZDW938q948Xf3vOmFs6QeSNdEn1w7O+NF2HJG9ur+xS02KkCgYEA44t9pr3OnTWhF7kDej2exlrE3WScPl6jFGiWCfq3QjBG3mK0OyzjB6bL1xrmEOfN0VVodrGl/aHBH5ds0cuNV5rDEFsf6b5Q2ZEixxJCO6OMx7nICSCE7mxQVgWvaryIF4Pt6tAv5zJqyDCyFz1OC54OH9ZqO4k6XTUtZM4DWjcCgYEA0lvgvrI6DrowqTqYVyuomvkYgDdPM2hPUAPgmsRuBuw7cJYvgyST1PyZIGNRSPcmQV+1wMeugPZ+I+ZocfcmRTJ+zhHpWoXEdymes6m+1H0sWm3tVwWYYsK0a+X017iyUXaGWSlGnaiijTmdFOCLo2K+6I0GM5cCRc3FXXtw/+MCgYAqO8XCoRAsVbvkr05Z7f3+SvKnNPlbCi2yqAbRK1vAST2eISvan+YzkV3cOv3gvWWSKQwOm8J3ZQJ3Xp+wANvnGq6B5qfxtoVDHJEb6eOpNh33JCBgsUx7BFeU39FDOmL4GmCaaLG7c7wmFAO6FILb3SY5+o4VJs9SZYBbaXFt2QKBgFkvzyfK1MattjfpufErd37NIdAqow++p/Ha0v2LTsLsoX7ojhhiB7ODrUCIG0x+TN/mvl6PyrKuz2hVJe87xCQOdqjT+0X/9P44zSqLS3c34vgsJzaADs3Ak1Iz2w0jJ6dWQzvGPkRV3SVXSfwx/8Iz+ZELSZfR7Iq/5W/vCEfVAoGBAIyDvtV1DXXNTmxe/YUM9CpI1NHywC7pacR05UYkuYChOTjt57diydCYna/LqZRhm7t29x1q0L2/NzpaP2kCE94spDGrZz0B+n1kNzO8XKJCmFTbP88QWdgNJbZD1CKWaKJeHOdDjf714ETJUesmoG6X/5WeFLfedx0yNQEwuSRK";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuvoXa//ctU0QVvpWRlEkW+D2Kb8EJFkktG8YL0mC8zbNPUyVsoThWYDfwMDCQGU3SFZNbVahuht6sOxU4C7m7o+2k4IcmzscIH6yMdgIk1+8R8glYvqR9RUFxtI+rDFTM/CIaxEPkYTLV88+TXadDbpLRDhYMcVtgMIVJwsOj2hE075bJD8soZRYwupbOQT1fxgVX/s10kgjUJGM96SOZ3XSC3rNV9VrRRnrNbXY2MVLwevULUpC5tHrXr5bAzdqQxD90xV336OL1U4AOJsRCNBNLUnjncepjGOo8dyRIpJzjgGPYh5ZSzPR4sCpqIzgNrMYDLt/O0FmI4Bi6OXHxQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8082/page/toMain";

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
