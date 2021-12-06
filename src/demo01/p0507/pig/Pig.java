package demo01.p0507.pig;

public class Pig {
    public String type;
    public String color;
    public int attack;
    public double weight;

    public void run() {
        System.out.println(type + "品种的" + color + "颜色的猪走来走去");
    }

    public void strike() {
        System.out.println(type + "品种的" + color + "颜色的猪打人啦，攻击力为" + attack);
    }

    public void eat(String foot) {
        System.out.println(type + "品种的" + color + "颜色的猪在吃" + foot);
    }

    public double money() {
        return weight * 9;
    }

    public int priMoney(int money) {
        return money * 5;
    }

    public double eatSweet(int sweet) {
        this.weight += sweet * 5;
        return weight;
    }
}
//1.写一个猪类：属性：品种，颜色，攻击力，体重，方法（方法内容可以自由发挥，符合要求即可）：
//        （一）无参数无返回值的方法：
//        1.猪走路的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪走来走去”
//        2.猪打人的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪打人了，攻击力为多少”
//        （二）有参无返回：
//        3.猪吃饭的方法，传入食物，要求输出格式为“某某品种的某某颜色的猪在吃某某”
//        （三）无参有返回：
//        4.猪报价方法：得到“该猪的总售价”
//        （四）有参有返回:
//        5.给猪10块钱，去买东西，买回来20个棒棒糖（参数为钱，返回值为棒棒糖个数）
//        6.喂给猪1个棒棒糖，得到体重增加：5斤（参数为糖个数，返回增加的体重）
//
//        说明：编写测试类，生成对象调用方法进行测试。