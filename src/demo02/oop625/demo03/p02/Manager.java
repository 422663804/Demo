package demo02.oop625.demo03.p02;

public class Manager {
    private final Keeper keeper = new Keeper();
    private final Trainer trainer = new Trainer();

    public void feed() {
        this.keeper.feed();
    }

    public void perform() {
        this.trainer.perform();
    }
}
//3.2 使用组合实现：
//        （一）编写一个饲养员类Keeper，有方法feed饲养；
//        （二）编写一个驯兽师类Trainer，有方法perform表演；
//        （三）编写一个动物园管理员类Manager，有两个私有属性：饲养员和驯兽师；有方法feed饲养动物，有方法perform表演；
//        （四）新建测试类，创建管理员调用方法进行测试。