package demo02.oop621.demo03;

public class Enemy {
    private String id;
    private int level;
    public static String type;

    public Enemy() {

    }

    public Enemy(String id, int level) {
        this.id = id;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //被打败而死亡
    public void dead() {
        System.out.println("父类的死亡方法");
    }
}
//        （三）敌人父类Enemy有属性id和级别level，有dead()方法表示被打败而死亡
//        （四）敌人子类Boss、CrazyEnemy、CuteEnemy、DreadEnemy，继承于Enemy，有静态属性type表示种类，都有dead()方法表示各自被打败而死亡的方法
//        （五）创建游戏类Game作为测试，有一个静态方法makeEnemy(int)参数为敌人类型（即type值），该方法根据参数创建对应的敌人对象并返回
//        （六）在游戏类入口main方法中创建一个玩家，一个敌人数组（长度随机、每个元素表示的敌人类型随机），
//        要求将数组作为参数传递给玩家的kill方法，以及循环敌人数组中每个元素并作为玩家kill方法的参数进行调用，查看输出结果。