package demo01.p0505.juicer;

public class TestJuicer {
    public static void main(String[] args) {
        Juicer juicer = new Juicer("天天");
        juicer.open();
        juicer.action();
        String result = juicer.actionJuicer("西瓜");
        String result2 = juicer.actionJuicer("蓝莓");
    }
}
