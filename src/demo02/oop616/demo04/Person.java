package demo02.oop616.demo04;

import java.util.Scanner;

public class Person {
    private int age = 18;
    public int count = 0;

    public int getAge() {
        if (age == 18) {
            System.out.println("年龄未设置");
            return 0;
        } else {
            System.out.println("年龄更改成功!");
            return age;
        }
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入更后的年龄:");
        int newAge = scanner.nextInt();
        if (newAge < 18) {
            System.out.println("设置失败");
        } else if (newAge == 18) {
            System.out.println("默认值为18岁，请从新输入年龄");
        } else {
            count++;
            this.age = newAge;
            if (count > 1) {
                System.out.println("年龄已经设置，设置失败");
            }
        }
    }
}
//4. 封装实现，写一个人类，无构造函数，有一个年龄属性，定义默认值18，请实现以下封装，要求：
//        （一）能设置年龄，但该值不能小于18，否则设置失败
//        （二）不能多次设置年龄，如果年龄已经设置，那么再次设置则提示年龄已经设置，设置失败
//        （三）可以获取年龄，如果没有设置就直接获取则提示年龄未设置，返回0
