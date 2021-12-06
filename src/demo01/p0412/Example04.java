package demo01.p0412;

public class Example04 {
    public static void main(String[] args) {
        for (int i =1;i<=15;i++){
            if (i%7==0){
                System.out.println("该数字为"+i);
                break;
            }
        }
    }
}
//要求使用break:循环输出1-15,如果遇到被7整除数字则退出循环
