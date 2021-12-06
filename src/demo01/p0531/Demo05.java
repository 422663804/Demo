package demo01.p0531;

public class Demo05 {
    public static void main(String[] args) {
        String str = "abc_123@163.com";
        String name = str.substring(0,7);
        String nameId = str.substring(7);
        System.out.println("用户名:"+name+" 域名:"+nameId);
    }
}
//截取某邮箱字符串中的用户名和域名名称以及域名类型：“abc_123@163.com”