package loop;

public class Example24_2 {
    public static void main(String[] args) {
        //题目1:
       /* for (int i = 1; i <= 9; i++) { //行
            for (int j = 1; j <= i; j++) { //思考：第i行有多少个？
                System.out.print(""+j);
            }
            System.out.println();
        }*/
        //题目2：
        for (int i = 0;i<=9;i++){
            for (int j = 0;j<=9-i;j++){
                System.out.println(" ");
            }
            for (int j = 0;j<=9-i;j++){
                System.out.println(" ");
            }
        }
    }
}

/*1、输出:
1
12
123
1234
12345
123456
1234567
12345678
123456789*/
/*2、换题：
输出:
        1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789*/
