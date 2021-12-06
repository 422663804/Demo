package face.p_extends;

public class Animal {
    public String name;
    protected String gender;
    public int age;

    public Animal() {
    }

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //跑
    public void run() {
        System.out.println(name + "在奔跑");
    }

    //吃
    public void eat() {
        System.out.println(name + "在享受美食");
    }

    //玩
    public void play() {
        System.out.println(name + "在玩");
    }
}

//猪
class Pig extends Animal {
}

//猫
class Car extends Animal {
    public double weight;

    public Car(){
    }
    public Car(String name,String gender,int age,double weight){
        super(name, gender, age);
        this.weight = weight;
    }
}

