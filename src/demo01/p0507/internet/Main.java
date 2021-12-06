package demo01.p0507.internet;

public class Main {
    public static void main(String[] args) {
        Internet internet = new Internet();
        internet.name = "传奇";
        internet.Boss = "张三";
        internet.customer = new String[]{"Jack","Tom","Marry","James"};
        internet.newName("Marry");
    }
}
