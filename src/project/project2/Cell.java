package project.project2;

public class Cell {
    public String brand;
    public int volt; //电压
    public int volume; //容量
    public static int currentVolume; //当前电量

    //充电
    public void charge() {
        int count = 0;
        if (currentVolume < 3000) {
            count += 1;
            currentVolume = 3000 - 200 * count;
            System.out.println("正在充电，当前电量为" + currentVolume);
            if (currentVolume == 0) {
                System.out.println("电池容量不足，请更换电池" +currentVolume);
            }
        } else {
            System.out.println("电量充足，不需要充电!,当前电量为:" + currentVolume);
        }
    }

    //放电
    public void discharge() {
        System.out.println("放电");
    }

    //更换电池
    public void replaceCell() {
        System.out.println("更换电池");
    }

    //描述
    public void getDescription() {

    }
}

//        1. 电池类(Cell)，有很多属性：品牌(brand)，电压(volt)，容量(volume)，当前电量（currentVolume）
//        电压如12v，15v，容量如2000毫安，6000毫安，当前电量为0说明不能开机需要充电。
//        方法有：充电(charge)，放电(discharge)，描述(getDescription)。
//        充电一次电池容量下降200毫安，放电接收一个放量多少的参数，按需要放电，比如打电话放电50毫安，打游戏放电100-500毫安等