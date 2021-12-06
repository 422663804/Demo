package demo01.p0409;

public class Example02 {
    public static void main(String[] args) {
        int year = 2010;
       double stu = 20;
        while (stu<=100) {
            stu=stu*1.25;
            year++;
        }
        System.out.println("超过100万人在"+year+"年");
    }
}
/*

2.某高校2010年学生20万人，每年增长25%，到哪一年超过100万人？
1、循环

*/
