package demo01.p0402;
//6. 使用 if 和 switch 分别实现：输入成绩打印结果，90以上A，80以上B，60以上C，不及格D。

import java.util.Scanner;
public class Example06 {
    public static void main(String[] args) {
        new show2().say2();
    }
}
class show2 {
    public void say2() {
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        int i = scanner6.nextInt();
      /*  if(i>90){
            System.out.println("90以上A");
        }else if (i>80&&i<=90){
            System.out.println("80以上B");
        }else if (i>60&&i<=80){
            System.out.println("60以上C");
        }else {
            System.out.println("不及格D");
        }*/
        switch (i / 10) {
            case 10:
            case 9:
                if (i > 90) {
                    System.out.println("90以上A");
                }
                break;
            case 8:
                if (i > 80 && i <= 90) {
                    System.out.println("80以上B");
                }
                break;
            case 7:
                if (i > 60 && i <= 80) {
                    System.out.println("60以上C");
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (i <= 60) {
                    System.out.println("不及格D");
                }
                break;
            default:
                System.out.println("您输入的等级有误，请从新输入");
                break;
        }
    }
}