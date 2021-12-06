package demo01.p0414;

public class Example04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 19; i++) { //公鸡上限
            for (int j = 0; j <= 33; j++) { //母鸡上限
                int k = 100 - i - j;
                if ((i * 5 + j * 3 + k / 3 == 100) && k % 3 == 0) {
                    count+=1;
                }
            }
        }
        System.out.println("一共有"+count+"种组合");
    }
}
/*
4.百元买百鸡问题:公鸡每只5元，母鸡每只3元，小鸡每3只1元。一百元买一百只鸡，要求三种鸡都要买，有多少种购买组合?
穷举法
*/
