package p0722;

public class VolatileTest {
    static volatile boolean isReady = false;
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isReady) {

                }
                System.out.println("线程运行...");
            }
        });

        System.out.println("线程启动。。。");
        thread.start();
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isReady = true;
    }
}
