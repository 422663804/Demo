package demo01.p0512.phone;

import java.util.Scanner;

public class Phone extends Cell {
    public String brand;
    public String color;
    public int[] cell; //电池
    public boolean isPowerOn;

    //    开机
    public void powerOn() {
        if (!isPowerOn) {
            System.out.println(brand + "手机正在开机");
            isPowerOn = true;
        } else {
            System.out.println("您已开机!请勿重新操作");
        }
    }

    //    关机
    public void powerOff() {
        if (isPowerOn) {
            System.out.println("正在关机");
            isPowerOn = false;
        } else {
            System.out.println("您已关机了");
        }
    }

    //    玩游戏
    public void play() {
        if (isPowerOn) {
            isPlay = true;
            discharge();
        } else {
            System.out.println("请开机再玩游戏!");
        }
    }

    //    打电话
    public void call() {
        if (isPowerOn) {
            isPlay = false;
            discharge();
        } else {
            System.out.println("您已关机，请开机!");
        }
    }

    //    更换电池
    public void replaceCell() {
        powerOff(); //先关机
        int[] array = new int[cell.length];
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择你的电池，1：5000毫安，2：4000毫安:");
        int num = scanner.nextInt();
        if (volume == 0 || currentVolume <= 4000) {
            if (num == 1) {
                currentVolume = cell[0];
            } else {
                currentVolume = cell[1];
            }
            System.out.println("成功更换电池");
            int length = cell.length - 1;
            if (length == 0) {
                System.out.println("已近没有电池可以更换!");
            }
        }
    }

    //    描述
    public void getDescription() {
        System.out.println("这是一台" + brand + "手机，颜色为:" + color + "电池容量为:" + currentVolume);
    }
}
//目标：创建一个Java项目模仿手机的使用。
//        描述：使用手机，可以开机关机，可以玩游戏打电话，可以充电，在打电话、玩游戏后消耗手机电池电量，电量过低则需要进行充电。
//        电量不够也不能继续使用。
//        类：
//        1. 电池类(Cell)，有很多属性：品牌(brand)，电压(volt)，容量(volume)，当前电量（currentVolume）
//        电压如12v，15v，容量如2000毫安，6000毫安，当前电量为0说明不能开机需要充电。
//        方法有：充电(charge)，放电(discharge)，描述(getDescription)。
//        充电一次电池容量下降200毫安，放电接收一个放量多少的参数，按需要放电，比如打电话放电50毫安，打游戏放电100-500毫安等
//        2. 手机(Phone)有很多属性：品牌(brand)，颜色(color)，电压(volt)，电池(cell)，开关机状态(isPowerOn)
//        方法有：开机(powerOn)，关机(powerOff)，充电(charge)（如果电池容量下降到0表示电池报废充电失败），玩游戏(play)，
//        打电话(call)（玩游戏接收一个耗电量参数，比如此游戏消耗1000毫安，或者小游戏消耗200毫安等，打电话和游戏必须是开机状态），
//        充电(charge)，更换电池(replaceCell)（更换电池，接收一个电池数组，从电池数组中挑选合适的电池更换到手机上），描述(getDescription)
//        3. 手机使用！（开机，关机，充电，玩游戏打电话等），准备几个备用电池（数组）做试验，生成一个手机对象，包括所有属性。
//        使用循环进行手机使用测试。
//        使用Java项目完成。