package demo02.oop621.demo01;

public class Frog extends Animal {
    public Frog() {
        super("青蛙王子", 10);
    }

    public void swim() {
        System.out.println(this.getName() + "正在洗澡，真凉快，快来一起荡起双桨吧！");
    }
}
