package p0731;

public class Demo05 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        new Thread(myThread5, "窗口1").start();
        new Thread(myThread5, "窗口2").start();
        new Thread(myThread5, "窗口3").start();
        new Thread(myThread5, "窗口4").start();
    }
}

class MyThread5 implements Runnable {
    private int tickets = 10;

    @Override
    public void run() {
        while (true) {
            saleTicket();
            if (tickets <= 0) {
                break;
            }
        }
    }

    //定义一个同步方法saleTicket()
    public synchronized void saleTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在售出第" + tickets-- + "张票");
        }
    }
}

//同步代码块和同步方法运行一样，都没有出现负数