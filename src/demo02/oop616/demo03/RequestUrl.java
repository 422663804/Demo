package demo02.oop616.demo03;


public class RequestUrl {
    private String url;
    private boolean result = false;

    public RequestUrl() {
    }

    public RequestUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    //请求方法
    public String requestUrl() {
        if (getUrl() != null) {
            result = true;
        }
        return url;
    }
}
//3. 实现一个网站请求类，有方法：get 获取请求结果，传递一个字符串表示的URL链接作为参数，返回一个结果。
//        要求对结果进行封装：
//        （一）返回结果为多个值，包括请求后是否成功（随机），以及请求后的内容（内容任意）
//        （二）返回结果是不能被随意篡改的
//        请设计以上程序。

