package p0731;

public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); //开启线程
        while (true) {
            System.out.println("Demo01主线程正在运行");
        }
    }
}

//通过继承Thread也能实现多线程的运行
class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyThread线程正在运行");
        }
    }
}