package demo01.p0505.mathe;

public class TestMathe {
    public static void main(String[] args) {
        Mathe mathe = new Mathe();
        int num1 = mathe.compare(88, 99);
        double num2 = mathe.compare2(22.2, 33.3, 11.1);
        int out1 = mathe.outNum(789);
        int out2 = mathe.cube(20);
        int sum = mathe.sumNum(100);
        double array1 = mathe.array(new double[]{4.2, 4.5, 5.6, 1.2, 7.8, 3.4});
        System.out.println("sum="+array1);
        double array2 = mathe.array2(new double[]{4.2, 4.5, 5.6, 1.2, 7.8, 3.4});
    }
}
