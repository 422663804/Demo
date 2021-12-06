package demo02.oop621.demo03;

import java.util.Random;

public class Game {
    public static Enemy makeEnemy(int i) {
        switch (i) {
            case 0:
                return new Boss();
            case 1:
                return new DreadEnemy();
            case 2:
                return new CuteEnemy();
            case 3:
                return new CrazyEnemy();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Player player = new Player("张三", "大将军", 70);
        DreadEnemy dreadEnemy = new DreadEnemy();
        CuteEnemy cuteEnemy = new CuteEnemy();
        CrazyEnemy crazyEnemy = new CrazyEnemy();
        Boss boss = new Boss();

        //给怪物设置等级
        dreadEnemy.setLevel(50);
        cuteEnemy.setLevel(60);
        crazyEnemy.setLevel(65);
        boss.setLevel(70);

        //将怪物传入怪物数组
        Enemy[] enemy = new Enemy[random.nextInt(20) + 4];
        enemy[0] = dreadEnemy;
        enemy[1] = cuteEnemy;
        enemy[2] = crazyEnemy;
        enemy[3] = boss;

//        System.out.println(game.makeEnemy(dreadEnemy));
        player.kill(enemy[2]);//打怪升级
        player.kill(enemy); //打了多少敌人
        player.kill(boss); //打Boss
    }
}
//        （三）敌人父类Enemy有属性id和级别level，有dead()方法表示被打败而死亡
//        （四）敌人子类Boss、CrazyEnemy、CuteEnemy、DreadEnemy，继承于Enemy，有静态属性type表示种类，都有dead()方法表示各自被打败而死亡的方法

//        （五）创建游戏类Game作为测试，有一个静态方法makeEnemy(int)参数为敌人类型（即type值），该方法根据参数创建对应的 敌人对象 并返回
//        （六）在游戏类入口main方法中创建一个玩家，一个敌人数组（长度随机、每个元素表示的敌人类型随机），
//        要求将数组作为参数传递给玩家的kill方法，以及循环敌人数组中每个元素并作为玩家kill方法的参数进行调用，查看输出结果。