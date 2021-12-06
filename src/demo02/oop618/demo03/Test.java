package demo02.oop618.demo03;

public class Test {
    public static void main(String[] args) {
        Cpro cpro = new Cpro();
        cpro.program();
        Bigcpro bigcpro = new Bigcpro();
        bigcpro.program();
        Prolike prolike = new Prolike();
        prolike.program();
        BigC bigC = new BigC();
        bigC.program();
        bigC.study();
        Programmer programmer = new Programmer("张三", 18, "Java", "深圳");
        System.out.println(programmer.toString());
    }
}
