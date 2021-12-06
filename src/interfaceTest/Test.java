package interfaceTest;

public class Test {
    public static void main(String[] args) {
//        运行时异常
        try {
            String str = null;
            str.toCharArray();
        } catch (Exception e) {
//            catch一定要写东西 如果偷懒的话可以写  e.printStackTrace(); 高级一点的话就打印日志
            e.printStackTrace(); //打印异常信息
            System.out.println("异常");
        } finally {
            System.out.println("这段代码无论错误还是不错误 都会运行，用来处理发生异常的善后工作");
        }
        System.out.println("如果用了捕获，不管处理与否 JVM都认为你已经处理了，可以运行后面的代码");
    }
}
