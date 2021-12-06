package demo01.p0505.player;

public class Player {
    public String name;
    public int grade;
    public int attack;

    public void killMonsters(int MonstersGrade, int MonstersAttack) {
        if (grade < MonstersGrade) {
            System.out.println(name + "挂了，被怪物杀死!");
        } else {
            if (attack > MonstersAttack) {
                grade += 10;
                System.out.println("成功杀死怪物，获得10000金子，提升10等级,等级为:" + grade);
            } else {
                System.out.println(name + "大败而逃!");
            }
        }
    }
}

class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "天天";
        player.grade = 20;
        player.attack = 999;
        player.killMonsters(10, 888);
        player.killMonsters(40, 888);
        player.killMonsters(30, 88);
        player.killMonsters(30, 888);
    }
}


//3. 写一个游戏玩家类，属性：昵称、等级、攻击力；方法：打怪升级。
//【要求】：传入两个参数，一个是怪物等级，一个是怪物攻击力，
//最后方法输出结果为：如果玩家等级低于怪物等级，直接打印“xxx挂了，被怪物杀死！”，
//xxx表示昵称；否则根据攻击力大小决定胜负，胜利则输出“成功杀死怪物，获得10000金子，提升10等级，等级为：yyy”，yyy为升级后的等级。
//输则打印“xxx大败而逃！”xxx为昵称。