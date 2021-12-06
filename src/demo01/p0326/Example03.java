package demo01.p0326;
//3. 定义一个整数变量，值为4612，判断该数是否能同时被3和13整除？
public class Example03 {
    public static void main(String[] args) {
        int a = 4612;
        if(a%3==0&&a%13==0){
            System.out.println("该数能同时被3和13整除");
        }else {
            System.out.println("该数不能同时被3和13整除");
        }
    }
}
