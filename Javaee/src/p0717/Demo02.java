package p0717;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流 在文件文字后面追加文字
 */

public class Demo02 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("example.txt",true);
//            String str = "测试文件";
           String str = "，将文件输出流后面加上true，新添加后面的一段文字";
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                fileOutputStream.write(b[i]);
            }
            System.out.println("成功");
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
