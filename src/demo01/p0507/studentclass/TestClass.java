package demo01.p0507.studentclass;

public class TestClass {

    public static void main(String[] args) {
        StuClass stuClass = new StuClass();
        stuClass.name = "耕达教育";
        stuClass.teacherName = "小仙女";
        stuClass.array = new String[]{"王五", "Tom", "Jack"};
        stuClass.showAll();
        stuClass.sum();
        System.out.println(stuClass.sum());
        boolean newName = stuClass.changeName("李四");
        System.out.println("张三".equals(stuClass.array[0]));
    }
}
