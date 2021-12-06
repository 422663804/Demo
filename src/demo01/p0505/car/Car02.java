package demo01.p0505.car;

import java.util.Scanner;

public class Car02 {
    public String name;
    public String gender;
    public int age;
    public String CarID;
    public String CarNumber;

    Scanner input = new Scanner(System.in);

    public void showAll() {
        System.out.println("汽车司机的姓名是" + name + "他是" + gender + "人，今年" + age + "岁了，驾驶证号为" + CarID + "汽车牌号为" + CarNumber);
    }

    public void actionCar() {
        System.out.println(name + "司机正在开" + CarNumber + "牌号的车");
    }

    public void stopCar() {
        System.out.println(name + "司机把" + CarNumber + "牌号的车停了下来");
    }

    public boolean checkPeople() {
        System.out.print("请输入肇事司机的姓名:");
        String people = input.next();
        System.out.println(people.equals(name));
        return people.equals(name);
    }

    public boolean checkCarID(String carID) {
        System.out.println(carID.equals("CarID"));
        return carID.equals("CarID");
    }
}

class Car03 {
    public static void main(String[] args) {
        Car02 car = new Car02();
        car.name = "梁竞天";
        car.gender = "男";
        car.age = 21;
        car.CarID = "20210506";
        car.CarNumber = "粤K12345";
        car.showAll();
        car.actionCar();
        car.stopCar();
        boolean result1 = car.checkPeople();
        boolean result2 = car.checkCarID("粤K88888");
    }
}
//4. 写一个汽车司机的类，类中有属性：姓名，性别，年龄，驾驶证号，汽车牌号。类中有方法：
//        （一）显示所有数据的方法。
//        （二）司机开车的方法，显示“某某司机正在开某某牌号的车”。
//        （三）司机停车的方法，显示“某某司机把某某牌号的车停了下来”
//        （四）有一肇事逃逸汽车司机在逃，写一个方法检查此司机是否是肇事司机某某某的方法，要求传入肇事司机的姓名，检查这个姓名是否是此司机的姓名，要求返回一个true或false。
//        （五）检查此司机是否是某某汽车牌号的方法，要求传入一个车牌号，检查这个牌号是否是此司机的汽车牌号，要求返回一个true或false。
