package demo02.oop618.demo05;

public class Manager {
    private static Manager manager = new Manager();
    private static Manager a = new A();
    private static Manager b = new B();
    private static Manager c = new C();

    public static Manager getA() {
        return a;
    }

    public static void setA(Manager a) {
        Manager.a = a;
    }

    public static Manager getB() {
        return b;
    }

    public static void setB(Manager b) {
        Manager.b = b;
    }

    public static Manager getC() {
        return c;
    }

    public static void setC(Manager c) {
        Manager.c = c;
    }

    public Manager() {
    }

    public static Manager getManager() {
        return manager;
    }

    public static void setManager(Manager manager) {
        Manager.manager = manager;
    }

    public void showABC() {

    }

    public void show() {
        a.showABC();
        b.showABC();
        c.showABC();
    }

    public static void main(String[] args) {
        manager.show();
    }
}
//5. 思考题：设计一个管理类Manager，用于获取被管理的A/B/C等类的对象，要求：
//        （1）A/B/C类不能被直接实例化
//        （2）Manager为单例类
//        （4）A/B/C类属性和方法自定义，添加测试类进行简单的测试
//        （3）通过Manager类获取A/B/C的实例对象，获取的对象可以唯一

