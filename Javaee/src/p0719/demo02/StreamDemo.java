package p0719.demo02;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class StreamDemo {

    @Test
    public void show() {
        String s;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream("test.txt"));
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                Scanner scanner = new Scanner(System.in);
                s = scanner.next();
                if (s != null) {
                    System.out.println("Read:" + s);
                } else {
                    break;
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
