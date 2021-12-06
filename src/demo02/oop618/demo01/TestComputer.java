package demo02.oop618.demo01;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.add('9', '1'));
        System.out.println(computer.add(1, 2));
        System.out.println(computer.add(1.0, 2.2));
        System.out.printf("%.2f", computer.add(1.2, 2.11));
    }
}
