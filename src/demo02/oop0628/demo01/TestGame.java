package demo02.oop0628.demo01;

public class TestGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
//1. 游戏中有敌人类Enemy，敌人类有攻击玩家的方法attack()，要求：
//        （一）编写敌人子类NormalEnemy，重写attack方法
//        （二）编写敌人子类BossEnemy，重写attack方法
//        （三）编写Game游戏类，有敌人数组属性Enemy[]，有play()游戏方法，游戏方法中调用所有敌人的攻击方法，编写入口进行测试
//        （四）因为每种敌人的攻击方法各不相同，游戏中也不允许有Enemy对象实例，所以Enemy类必须为抽象类，attack()方法为抽象方法。