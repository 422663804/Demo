package demo02.oop0628.demo01;

public class Game {
    private Enemy[] enemy = new Enemy[2];

    public Game() {

    }

    public Game(Enemy[] enemy) {
        this.enemy = enemy;
    }

    public Enemy[] getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy[] enemy) {
        this.enemy = enemy;
    }

    public void play() {
//        将敌人存在数组中
        enemy[0] = new BossEnemy();
        enemy[1] = new NormalEnemy();
//        调用各自的攻击方法
        for (Enemy value : enemy) {
            value.attack();
        }
    }
}