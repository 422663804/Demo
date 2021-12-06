package p0717;

import org.junit.Test;

import java.io.*;

public class Demo04 {

    @Test
    public void testFile() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Hello.txt"); //@Test测试，从当前Module下找文件
            int data = fileInputStream.read(); //将读入的数据返回
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read(); //需要进行阅读下一个字节 可以理解为自增
            }
            fileInputStream.close(); //I/O流要进行关闭
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFileArray() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Hello.txt");
            char[] array = new char[5];
            int len;
            while ((len = fileReader.read(array)) != -1) {
                for (int i = 0; i < len; i++) { //len 为文件读取了多少、长度
                    System.out.print(array[i]);
                }
                //方法二
//                final String s = new String(array,0,len);
//                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileWrite() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("log.txt");
            fileWriter.write("这是一段测试文字,Write操作如果文件不存在，则自动创建一个文件\n");
            fileWriter.write("如果文件存在 看用了那个构造器Write(file,false)/Write(file) 将自动覆盖文件\n");
            fileWriter.write("构造器Write(file,true),将会追加文字在其文件后面\n");
            fileWriter.write("ABCD".toLowerCase());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 使用字节流 将.jpg文件复制
     */
    @Test
    public void testFileOutStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("name1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("name.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
