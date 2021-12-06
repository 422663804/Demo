package demo01.p0426;

public class Dog {
    public String type;
    public String color;
    public String weight;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.type = "哈士奇";
        dog.color = "白色";
        dog.weight = "20KG";
        System.out.println("这只狗的品种是:" + dog.type + " 颜色:" + dog.color + " 体重:" + dog.weight);
    }
}

//1.	创建一个项目，写一个狗类，类的属性:品种，颜色，体重。再写一个入口做测试，生成狗类对象，给属性赋值，最后打印输出到控制台。