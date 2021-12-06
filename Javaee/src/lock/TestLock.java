package lock;

import java.util.concurrent.CountDownLatch;

public class TestLock {
    static L l = new L();

    public static void main(String[] args) {
        lockTest();
    }

    public static void lockTest() {
        synchronized (l) {
            System.out.println("测试synchronized同步锁1");
            System.out.println("测试synchronized同步锁2");
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        System.out.println(countDownLatch.getCount());
        System.out.println(countDownLatch.toString());
    }
}
