package p0731;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NIODemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        FileChannel channel = null;
        FileChannel cin = null;
        try {
            fis = new FileInputStream("D:\\耕达教育\\Demo\\Javaee\\log.txt");
            fos = new FileOutputStream("D:\\耕达教育\\Demo\\Javaee\\write.txt");

            //获取fis的字节，将它转移到channel中
            channel = fis.getChannel();
            //获取fos的字节，将它转移到cin中
            cin = fos.getChannel();
            //将channel内容转移到cin中
//            position - 传输开始的文件中的位置; 必须是非负的
//            count - 要传输的最大字节数; 必须是非负的
//            target - 目标频道
            channel.transferTo(0, channel.size(), cin);

            long end = System.currentTimeMillis();
            System.out.println("所用时间:" + (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
