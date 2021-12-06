package demo01.p0505.monsters;

public class TestMonsters {
    public static void main(String[] args) {
        Monsters monsters = new Monsters();
        monsters.type = "大蛇";
        monsters.hp = 99999;
        monsters.attack = 999;
        for (int i = 1; i <= 8; i++) {
            monsters.show("小怪" + i);
        }
        monsters.place();
    }
}
