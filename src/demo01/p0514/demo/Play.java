package demo01.p0514.demo;

public class Play {
    public String type;
    public int lever;
    public int maxMark;

    public void start() {
        System.out.println("开始游戏");
    }

    public void await() {
        System.out.println("加载游戏");
    }

    public void playOff() {
        System.out.println("退出游戏");
    }

    public static void main(String[] args) {
        Play play = new Play();
        play.type = "冒险型";
        play.lever = 100;
        play.maxMark = 999;
        play.start();
        play.await();
        play.playOff();
    }
}
//创建一个简单的游戏对象，属性有：类型、关卡数、最高分，方法有：开始游戏，加载游戏，退出游戏。