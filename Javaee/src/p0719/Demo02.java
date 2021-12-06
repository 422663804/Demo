package p0719;

public class Demo02 {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();
        new Thread(ticketWindow, "窗口1").start();
        new Thread(ticketWindow, "窗口2").start();
        new Thread(ticketWindow, "窗口3").start();
        new Thread(ticketWindow, "窗口4").start();
    }
}

class TicketWindow implements Runnable {
    private int tickets = 12;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                Thread thread = Thread.currentThread(); //获取当前线程
                String name = thread.getName(); //获取线程的名字
                System.out.println(name + "正在打印第" + tickets-- + "张票");
            }else if (tickets==0) {
                break;
            }
        }
    }
}