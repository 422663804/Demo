package demo01.p0507.pig;

public class TestPig {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.type = "黑猪";
        pig.color = "黑色";
        pig.attack = 999;
        pig.weight = 200;
        pig.run();
        pig.strike();
        pig.eat("野果");
        double money = pig.money();
        System.out.println("money=" + money);
        int priMoney = pig.priMoney(10);
        System.out.println("priMoney=" + priMoney);
        double eatSweet = pig.eatSweet(20);
        System.out.println("eatSweet=" + eatSweet+"斤");
    }
}
