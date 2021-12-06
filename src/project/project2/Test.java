package project.project2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println();
        System.out.println("-------------高端智能手机-------------");
        System.out.println("-------------开机请选择:1-------------");
        System.out.println("-------------关机请选择:0-------------");
        System.out.println("-------------充电请选择:2-------------");
        System.out.println("------------玩游戏请选择:3-------------");
        System.out.println("------------打电话请选择:4-------------");
        System.out.println("-----------更换电池请选择:5-------------");
        System.out.println("-------------退出请输入:10-------------");
        System.out.println();
        System.out.println("***********************************");

        Scanner scanner = new Scanner(System.in);

        Cell cell = new Cell();
        cell.brand = "天天";
        cell.volt = 15;
        cell.volume = 3000;
        cell.currentVolume = 2000;

        Phone phone = new Phone();
        phone.isPowerOn = 0; //默认为关机状态

        while (true) {
            System.out.print("请输入您的操作:");
            int input = scanner.nextInt();
            switch (input) {
                //关机
                case 0:
                    phone.powerOff();
                    break;
                //开机
                case 1:
                    phone.powerOn();
                    break;
                //充电
                case 2:
                    cell.charge();
                    break;
                //玩游戏
                case 3:
                    phone.play();
                    break;
                //打电话
                case 4:
                    phone.call();
                    break;
                //更换电池
                case 5:
                    cell.replaceCell();
                    break;
                case 10:
                    System.out.println("程序结束!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您输入的有误，请从新输入!");
                    break;
            }
        }
    }
}
/*
目标：创建一个Java项目模仿手机的使用。
        描述：使用手机，可以开机关机，可以玩游戏打电话，可以充电，在打电话、玩游戏后消耗手机电池电量，电量过低则需要进行充电。
        电量不够也不能继续使用。

        类：

        1. 电池类(Cell)，有很多属性：品牌(brand)，电压(volt)，容量(volume)，当前电量（currentVolume）
        电压如12v，15v，容量如2000毫安，6000毫安，当前电量为0说明不能开机需要充电。
        方法有：充电(charge)，放电(discharge)，描述(getDescription)。
        充电一次电池容量下降200毫安，放电接收一个放量多少的参数，按需要放电，比如打电话放电50毫安，打游戏放电100-500毫安等

        2. 手机(Phone)有很多属性：品牌(brand)，颜色(color)，电压(volt)，电池(cell)，开关机状态(isPowerOn)
        方法有：开机(powerOn)，关机(powerOff)，充电(charge)（如果电池容量下降到0表示电池报废充电失败），玩游戏(play)，
        打电话(call)（玩游戏接收一个耗电量参数，比如此游戏消耗1000毫安，或者小游戏消耗200毫安等，打电话和游戏必须是开机状态），
        充电(charge)，更换电池(replaceCe
        ll)（更换电池，接收一个电池数组，从电池数组中挑选合适的电池更换到手机上），描述(getDescription)

        3. 手机使用！（开机，关机，充电，玩游戏打电话等），准备几个备用电池（数组）做试验，生成一个手机对象，包括所有属性。
        使用循环进行手机使用测试。
        使用Java项目完成。
        */
