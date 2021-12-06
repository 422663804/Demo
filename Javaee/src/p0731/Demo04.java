package p0731;

public class Demo04 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        new Thread(myThread4, "窗口1").start();
        new Thread(myThread4, "窗口2").start();
        new Thread(myThread4, "窗口3").start();
        new Thread(myThread4, "窗口4").start();
    }
}

class MyThread4 implements Runnable {
    private int tickets = 10;
    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets > 0) {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在售出第" + tickets-- + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
/*
 * 注:因为线程获取锁对象是具有一定随机性的，有些线程没有被调用这是正常现象
 */