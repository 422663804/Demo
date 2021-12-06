package demo01.p0507.studentclass;

import java.util.Arrays;

public class StuClass {
    public String name;
    public String teacherName;
    public String[] array;

    public void showAll() {
        System.out.println("班级名称:" + name + " 班主任姓名:" + teacherName + " 班级有学生:" + Arrays.toString(array));
    }

    public int sum() {
        return array.length;
    }

    public boolean changeName(String name) {
        array[0] = "张三";
        return "张三".equals(name);
    }
}

//2.写一个班级类，有属性：班级名称、班主任名字、所有学生姓名数组；有方法：
//        （一）展示班级信息的方法：打印班级名称和班主任名字以及所有学生的名字
//        （二）得到班级学生个数的方法：调用该方法返回改班级的学生人数
//        （三）更改学生姓名的方法：传入要改的原名，以及要改成的新名字，返回是否修改成功
