package p0731;

public class Demo02 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2); //创建一个线程，将MyThread实例化对象放到线程中
        thread.start();
        while (true) {
            System.out.println("Demo02在主线程中运行");
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("实现接口Runnable后MyThread2在运行");
        }
    }
}
