package demo01.p0409;

public class Example07 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i <= 99; i++) {
            sum+=i/(i+1);
        }
        System.out.println("sum="+sum);
    }
}
/*
7.计算1/2+2/3+3/4+4/5+....+99/100的结果。*/
