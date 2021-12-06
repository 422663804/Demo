package demo02.oop625.demo03.p01;

public class Test {
    public static void main(String[] args) {
        Manager manager1 = new Keeper();
        Manager manager2 = new Trainer();
        manager1.feed();
        manager2.perform();
    }
}
//        （四）新建测试类，创建管理员调用方法进行测试。