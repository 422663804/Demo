package interfaceTest;

public class Demo03 {
    public static void main(String[] args) {
//        创建接口的非匿名实现类的非匿名对象
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

//接口
interface NetWork {
    void browse();
}

//代理类
class ProxyServer implements NetWork {
    private final NetWork netWork;

    public ProxyServer(NetWork netWork) {
        this.netWork = netWork;
    }

    public void check() {
        System.out.println("检查服务器是否有误");
    }

    @Override
    public void browse() {
        check();
        netWork.browse();
    }
}

//被代理类
class Server implements NetWork {
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}