package demo01.p0407;
//3. 使用while循环输出10到100之间所有能被5整除的数。

public class Example03 {
    public static void main(String[] args) {
        int i=10;
        while (i<=100){
            if (i%5==0){
                System.out.print("\t"+i);
            }
            i++;
        }
    }
}
