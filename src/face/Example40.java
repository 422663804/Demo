package face;

import java.util.Scanner;

public class Example40 {
    public static void main(String[] args) {
        new sea().sea2();
    }
}

class sea {
    public void sea2() {
        System.out.println("1、放水");
        System.out.println("2、吸水");
        System.out.println("0、退出");
        Scanner sc_sea = new Scanner(System.in);
        System.out.print("请输入你的操作:");
        int a = sc_sea.nextInt();
        int i = 1000;
        while (true) {
            if (a == 1) {
                i = i - 200;
                System.out.println("海绵状态为" + i + "ml");
                System.out.print("请输入你的操作:");
                a = sc_sea.nextInt();
                if (i == 200) {
                    System.out.println("海绵水干了");
                }else if (i<=0){
                    System.out.print("不能放水，请选择其他操作:");
                    a= sc_sea.nextInt();
                }
            } else if (a == 2) {

            } else if (a == 3) {
                System.exit(0);
            }
        }
    }
}


/*
写一个类表示海绵，海绵有一组吸水孔（用孔径表示），海绵有吸水和放水的功能。
1、写一个类表示海绵
2、吸水孔（孔径表示）
3、吸水和放水 两个功能
功能：海绵满水状态为1000ml，每次挤压减少200ml水量，每次吸水增加200ml水量。最轻为200ml
*/
