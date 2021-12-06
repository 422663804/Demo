package demo01.p0512.phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.color = "天空蓝";
        phone.isPowerOn = true;

        Cell cell = new Cell();
        cell.volt = 12;
        cell.volume = 0;

        while (true) {
            System.out.println("0:关机，1:开机，2:充电,3:玩游戏,4:打电话,5:换电池,6:描述，8:退出");
            System.out.print("请选择你的操作:");
            int num = input.nextInt();
            switch (num) {
                case 0:
                    phone.powerOff(); //关机
                    break;
                case 1:
                    phone.powerOn(); //开机
                    break;
                case 2:
                    cell.charge();  //充电
                    break;
                case 3:
                    phone.play();   //玩游戏
                    break;
                case 4:
                    phone.call();   //打电话
                    break;
                case 5:
                    phone.cell = new int[2]; //有3块电池
                    phone.cell[0] = 5000;
                    phone.cell[1] = 4000;
                    phone.replaceCell(); //更换电池
                    break;
                case 6:
                    phone.getDescription(); //描述
                    break;
                case 8:
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("您输入的操作有误!");
                    break;
            }
        }
    }
}
//3. 手机使用！（开机，关机，充电，玩游戏打电话等），准备几个备用电池（数组）做试验，生成一个手机对象，包括所有属性。
//        使用循环进行手机使用测试。