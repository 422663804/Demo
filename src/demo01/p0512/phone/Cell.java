package demo01.p0512.phone;

import java.util.Scanner;

public class Cell {
    public int volt;
    public int volume; //容量
    public static int currentVolume = 6000; //当前电量
    public boolean isPlay; //判断打游戏还是打电话

    //    充电 有误
    public void charge() {
        if (currentVolume <= 1000) {
            volume += 200;
            currentVolume = 6000 - volume;
            if (currentVolume == 0) {
                System.out.println("电池寿命已尽，请更换电池!");
            }
            System.out.println("充电完成，现在电量为:" + currentVolume + "ml");
        } else {
            System.out.println("电量充足，不需要充电");
        }
    }

    //   放电
    public void discharge() {
        if (isPlay) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请选择你要玩的游戏:0:和平暖暖,1:开心消消乐  :");
            int chose = scanner.nextInt();
            if (chose == 0 && currentVolume >= 1000) {
                currentVolume -= 1000;
                System.out.println("恭喜你成功吃鸡");
                System.out.println("当前电量" + currentVolume);
            } else if (chose == 1 && currentVolume >= 200) {
                currentVolume -= 200;
                System.out.println("恭喜你通关");
                System.out.println("当前电量" + currentVolume);
            } else {
                System.out.println("电量不足，请充电");
            }
        }
        if (!isPlay) {
            if (currentVolume >= 50) {
                currentVolume -= 50;
                System.out.println("您已和女朋友打完电话，现在电量为:" + currentVolume);
            } else {
                System.out.println("电量不足，请充电");
            }
        }
    }
}

//        1. 电池类(Cell)，有很多属性：品牌(brand)，电压(volt)，容量(volume)，当前电量（currentVolume）
//        电压如12v，15v，容量如2000毫安，6000毫安，当前电量为0说明不能开机需要充电。
//        方法有：充电(charge)，放电(discharge)，描述(getDescription)。
//        充电一次电池容量下降200毫安，放电接收一个放量多少的参数，按需要放电，比如打电话放电50毫安，打游戏放电100-500毫安等