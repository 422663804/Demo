package p0731;

public class LockTest01 {
    public static void main(String[] args) {
        DeadLockThread1 deadLockThread1 = new DeadLockThread1(true);
        DeadLockThread1 deadLockThread2 = new DeadLockThread1(false);
        new Thread(deadLockThread1, "线程一").start();
        new Thread(deadLockThread2, "线程二").start();
    }
}

class DeadLockThread1 implements Runnable {
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    private boolean flag;

    public DeadLockThread1(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (lock2) { //lock2锁对象上的同步代码块
                    String name1 = Thread.currentThread().getName();
                    System.out.println(name1 + "正在运行1");
                    synchronized (lock1) {//lock1锁对象上的同步代码块
                        String name2 = Thread.currentThread().getName();
                        System.out.println(name2 + "正在运行2");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (lock1) { //lock1锁对象上的同步代码块
                    String name3 = Thread.currentThread().getName();
                    System.out.println(name3 + "正在运行3");
                    synchronized (lock2) {//lock2锁对象上的同步代码块
                        String name4 = Thread.currentThread().getName();
                        System.out.println(name4 + "正在运行4");
                    }
                }
            }
        }
    }
}