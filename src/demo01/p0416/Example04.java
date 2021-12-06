package demo01.p0416;

public class Example04 {
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
/*
4. 打印乘法口诀表：
        1x1=1 1x2=2 1x3=3 1x4=4 1x5=5 1x6=6 1x7=7 1x8=8 1x9=9
        2x2=4 2x3=6 2x4=8 2x5=10 2x6=12 2x7=14 2x8=16 2x9=18
        3x3=9 ...
        ...*/
