package p0717;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    @Test
    public void showFile() {
        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
        try {
//        1、创建map集合
            Map<Character, Integer> map = new HashMap<>();
//        2、读取文件 将文件的字符出现的次数放到map当中
            fileReader = new FileReader("log.txt");
            int len;
            while ((len = fileReader.read()) != -1) {
                char c = (char) len;
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
            bufferedWriter = new BufferedWriter(new FileWriter("show.txt"));
//        3|遍历map 写入数据
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                switch (entry.getKey()) {
                    case ' ':
                        bufferedWriter.write("空格=" + entry.getValue());
                        break;
                    case '\t':
                        bufferedWriter.write("tab键=" + entry.getValue());
                        break;
                    case '\n':
                        bufferedWriter.write("换行=" + entry.getValue());
                        break;
                    default:
                        bufferedWriter.write(entry.getKey() + "=" + entry.getValue());
                        break;
                }
                bufferedWriter.newLine(); //换行
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    fileReader.close();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
