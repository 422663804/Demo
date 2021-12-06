package demo01.p0426;

public class Teacher {
    public int age;
    public String gender;
    public String subject;
    public double money;
    public boolean marry;

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
       /* teacher.age = 18;
        teacher.gender = "男";
        teacher.subject = "java";
        teacher.money = 20000;
        teacher.marry = false;*/
        System.out.println("年龄" + teacher.age + "性别" + teacher.gender + "教学科目" + teacher.subject + "薪资" + teacher.money + "婚否" + teacher.marry);
    }
}
/*
写一个教师类，类中有属性:年龄(整数)，性别(字符)，教学科目(字符串)，薪资(小数)，婚否(布尔)。写入口测试类进行运行和输出打印。
 要求:继续创建一个新的教师对象，不需要给此对象的属性赋值，直接打印测试该对象的每一个属性的值。
*/
