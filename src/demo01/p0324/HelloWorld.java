package demo01.p0324;

public class HelloWorld {
    public static void main (String[ ] args){
       new Demo().demo();
    }
}
class Demo{
    public void demo(){
        System.out.println("  日  一  二  三  四  五  六 ");
        int sum=0;
        for (int i = 1;i<=4;++i){
            System.out.print("   "+i);
            ++sum;
        }
        for (int j = 5;j<30;++j){
            if (sum%7==0){
                System.out.println();
                ++sum;
            }else {
                System.out.print("  "+j);
                sum++;
            }

        }
    }

}