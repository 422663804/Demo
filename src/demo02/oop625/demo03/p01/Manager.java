package demo02.oop625.demo03.p01;

public class Manager {
    public void feed(){
    }
    public void perform(){
        Trainer trainer = new Trainer();
        trainer.perform();
    }

}
//3.1 使用继承实现：
//        （一）编写一个动物园管理员类Manager，有方法feed饲养动物，有方法perform表演；
//        （二）编写一个饲养员类Keeper，有方法feed饲养；继承于管理员；
//        （三）编写一个驯兽师类Trainer，有方法perform表演；继承于管理员；
//        （四）新建测试类，创建管理员调用方法进行测试。

