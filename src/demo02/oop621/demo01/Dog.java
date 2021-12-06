package demo02.oop621.demo01;

public class Dog extends Animal {
    public Dog() {
        super("哈士奇", 80);
    }

    public void bite() {
        System.out.println("我是" + this.getName() + "别惹我，咬死你，兔子急了还咬狗呢！");
    }
}
