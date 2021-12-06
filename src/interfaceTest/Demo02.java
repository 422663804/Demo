package interfaceTest;

public class Demo02 {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        1、创建接口的非匿名实现类的非匿名对象
        Printer printer = new Printer();
        computer.transportDate(printer);
//        2、创建接口的非匿名实现类的匿名对象
        computer.transportDate(new Printer());
//        3、创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("-----------------");
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        computer.transportDate(phone);
//        4、创建接口的匿名实现类的匿名对象
        computer.transportDate(new USB() {
            @Override
            public void start() {
                System.out.println("----------------");
                System.out.println("匿名实现类的匿名对象start()方法");
            }

            @Override
            public void stop() {
                System.out.println("匿名实现类的匿名对象stop()方法");
            }
        });
    }
}

interface USB {
    //    开始
    void start();

    //    结束
    void stop();
}

//电脑
class Computer {
    //    传输数据的方法
    public void transportDate(USB usb) {  //相当于USB usb = new Printer(); 父类引用子类的对象
        usb.start();
        System.out.println("中间具体的方法");
        usb.stop();
    }
}

//打印机
class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机接收数据，开始打印");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止接收数据，打印结束");
    }
}