package demo01.p0331;
//猴子去买桃，如果买3个以下，老板就不送桃，如果买3个到5个就再送一个桃，
// 如果买5个以上就送2个桃，现在要求输入猴子的买桃数，最后输出到底买到了几个桃。

import java.util.Scanner;
public class Example04 {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("请输入桃子数量");
        int i = scanner5.nextInt();
        if (i<3){
            System.out.println("不送桃子，共买到"+i+"个桃子");
        }else if (i>=3&&i<=5){
            System.out.println("靓仔，送你多1个桃子吧，共买到"+(i+1)+"个桃子");
        }else if (i>5){
            System.out.println("靓仔，送你多2个桃子吧，共买到"+(i+2)+"个桃子");
        }
    }
}
