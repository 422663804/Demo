package demo01.p0526;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        String str = "truefalsefalsetruetruefalse";
        boolean[] array = new boolean[str.length() / 4];
        int index = 0;
        for (int i = 0; i < str.length(); ) {
            if (str.substring(i, i + 4).equals("true")) {
                i += 4;
                array[index] = true;
            } else {
                i += 5;
                array[index] = false;
            }
            index++;
        }
        System.out.println(Arrays.toString(array));
    }
}
//4. 已知字符串由一串"true""false"拼接成：“truefalsefalsetruetruefalse”，请将该字符串转换为 布尔数组 ，并输出。
//“true false false true true false”