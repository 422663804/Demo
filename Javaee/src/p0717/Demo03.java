package p0717;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流的操作文件
 * 1、创建文本阅读器传入文本对象
 * 2、定于int变量，用于读取字符的长度
 * 3、将int类型转为char类型输出
 */

public class Demo03 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test.txt");
            int len;
            while ((len = fileReader.read()) != -1) {
                System.out.println((char) len);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
