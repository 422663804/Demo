package demo02.oop616.demo03;

public class Test {
    public static void main(String[] args) {
        RequestUrl requestUrl = new RequestUrl("https://www.bilibili.com/");
        requestUrl.requestUrl();
        System.out.println("请求" + requestUrl.isResult() + "网站地址为" + requestUrl.requestUrl().toString());
    }
}
