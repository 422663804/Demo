package demo01.p0531;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 7 == 0) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
//2.	要求使用break：循环输出1-15，如果遇到被7整除数字则退出循环
