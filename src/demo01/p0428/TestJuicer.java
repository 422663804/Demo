package demo01.p0428;

public class TestJuicer {
    public static void main(String[] args) {
        System.out.print("通电请输入整数1，不通电输入其他整数:");
        Juicer juicer = new Juicer();
        juicer.open();
        juicer.action();
        juicer.actionJuicer();
    }
}
