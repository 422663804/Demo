package demo02.oop621.demo03;

public class Player {
    private String name;
    private String career;
    private int level;

    public Player() {

    }

    public Player(String name, String career, int level) {
        this.name = name;
        this.career = career;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //打怪升级
    public void kill(Enemy enemyAll) {
        if (this.level > enemyAll.getLevel()) {
            this.level++;
            System.out.println("成功打败crazyEnemy");
        } else {
            System.out.println("太年轻了，回家练练吧");
        }
    }

    //打了多少敌人
    public void kill(Enemy[] enemy) {
        int count = 0;
        for (int i = 0; i < enemy.length; i++) {
            if (enemy[i] != null) {
                count++;
            }
        }
        System.out.println("打了" + count + "个敌人");
    }

    //    打BOSS
    public void kill(Boss BOSS) {
        if (this.level > BOSS.getLevel()) {
            BOSS.dead();
        } else {
            System.out.println("挑战Boss失败");
        }
    }
}
//创建一个玩家类和敌人类，要求：
//        （一）玩家类Player有属性名字name和职业career、等级level（封装基本属性）
//        （二）玩家有方法
//        kill(Enemy)打怪升级，参数为敌人；
//        kill(Enemy[])打多个敌人，参数为敌人数组；
//        kill(Boss)打BOSS方法，参数为Boss；
//        kill方法的方法体都调用敌人的dead方法，表示被打败

//        （三）敌人父类Enemy有属性id和级别level，有dead()方法表示被打败而死亡（封装基本属性）
//        （四）敌人子类Boss、CrazyEnemy、CuteEnemy、DreadEnemy，继承于Enemy，有静态属性type表示种类，都有dead()方法表示各自被打败而死亡的方法(继承)

//        （五）创建游戏类Game作为测试，有一个静态方法makeEnemy(int)参数为敌人类型（即type值），该方法根据参数创建对应的敌人对象并返回
//        （六）在游戏类入口main方法中创建一个玩家，一个敌人数组（长度随机、每个元素表示的敌人类型随机），
//        要求将数组作为参数传递给玩家的kill方法，以及循环敌人数组中每个元素并作为玩家kill方法的参数进行调用，查看输出结果。
