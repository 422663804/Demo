package p0731;

public class Demo03 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        new Thread(myThread3, "窗口1").start();
        new Thread(myThread3, "窗口2").start();
        new Thread(myThread3, "窗口3").start();
        new Thread(myThread3, "窗口4").start();
        new Thread(myThread3, "窗口5").start();
    }
}

class MyThread3 implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                Thread thread = Thread.currentThread(); //获取当前线程
                String name = thread.getName(); //获取当前线程的名字
                System.out.println(name + "正在售出第" + tickets-- + "张票");
            } else {
                break;
            }
        }
    }
}