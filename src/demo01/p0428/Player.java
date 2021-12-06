package demo01.p0428;

public class Player {
    public String name;
    public int grade;
    public String role;
    public double attack;//攻击力
    public double life;

    public void attack() {//攻击
        System.out.println(name + "攻击" + attack + " 生命值" + life);
    }

    public void rest() {//休息
        System.out.println(name + "休息");
    }

    public void task() {//做任务
        System.out.println(name + "做任务");
    }

    public void death() {//死亡
        System.out.println(name + "死亡");
    }
}

/*
写一个玩家类【不需要测试】，要求有属性：名字、等级、角色、攻击力、生命值。有方法：攻击、休息、做任务、死亡。
说明：方法体内容打印相关文字即可，注意包含玩家的相关属性，比如名字。
*/
