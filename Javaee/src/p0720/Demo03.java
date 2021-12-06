package p0720;

import org.junit.Test;

import java.io.*;
import java.util.*;

/**
 * 姓氏统计:一个文本文件中存储着北京所有高校在校生的姓名，格式如下:
 * 每行一个名字，姓与名以空格分隔:
 * 张 三
 * 李 四
 * 王 小五
 * 现在想统计所有的姓氏在文件中出现的次数，请描述一下你的解决方案。
 * <p>
 * 思路：
 * 1、先将文件读取 用字符流
 * 2、
 */


public class Demo03 {
    @Test
    public void countName() {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("name.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String value = null;
            outer:
            while ((value = bufferedReader.readLine()) != null) {
                char[] c = value.toCharArray();
                for (int i = 0; i < c.length; i++) {
                    if (c[i] != ' ') {
                        stringBuilder.append(String.valueOf(c[i]));
                    } else {
                        if (map.containsKey(stringBuilder.toString())) {
                            int count = map.get(stringBuilder.toString());
                            map.put(stringBuilder.toString(), count + 1);
                        } else {
                            map.put(stringBuilder.toString(), 1);
                        }
                        stringBuilder.delete(0, stringBuilder.length());
                        continue outer;
                    }
                }
            }
//            输出结果
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> next = iterator.next();
                System.out.println(next.getKey() + "-->" + next.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

