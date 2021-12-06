package p0717;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt"); //文件要放在父类文件夹里面
            int b = 0;
            while (true) {
                b = fileInputStream.read();
                if (b == -1) {
                    break;
                } else {
                    System.out.println(b);
                }
            }
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
