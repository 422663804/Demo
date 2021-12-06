package p0719;

public class Demo01 {
    public static void main(String[] args) {
//        主线程
        MyThread myThread = new MyThread();
        System.out.println("主线程开启。。。");
        for (int i = 0; i < 5;i++){
            System.out.println("主线程输出。。。");
            myThread.run();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("主线程结束。。。");
    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("子线程运行。。。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}