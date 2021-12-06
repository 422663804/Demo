package p0720;

/**
 * 线程的优先级setPriority(int newPriority)
 */

public class Demo01 {
    public static void main(String[] args) {
//        1、创建两个线程
        Thread minPriority = new Thread(new MinPriority(), "优先级较低的");
        Thread maxPriority = new Thread(new MaxPriority(), "优先级较高的");
//        2、给线程设置优先级
        minPriority.setPriority(Thread.MIN_PRIORITY);
        maxPriority.setPriority(10);
//        3、开启线程
        maxPriority.start();
        minPriority.start();
    }
}

class MaxPriority implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出" + i);
        }
    }
}

class MinPriority implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出" + i);
        }
    }
}