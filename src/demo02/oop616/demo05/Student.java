package demo02.oop616.demo05;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name[] = new String[5];

    public Student() {
    }

    public Student(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    //    初始化学员
    public void setNames() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                System.out.print("请输入第" + (i + 1) + "位学生的姓名:");
                name[i] = scanner.next();
                System.out.print("是否继续录入姓名(y/n)）:");
                String chose01 = scanner.next();
                if (chose01.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
        System.out.println("学生的姓名数组:" + Arrays.toString(name));
    }

    //    修改学员姓名
    public boolean changeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要修改姓名的学生:");
        String findName = scanner.next();
        boolean result = true;
        for (int i = 0; i < name.length; i++) {
            if (findName.equals(name[i])) {
                System.out.print("有这名学生,请输入要新姓名:");
                name[i] = scanner.next();
                result = false;
            }
        }
        if (result) {
            System.out.println("没有该名学生");
        }
        System.out.println("学生的姓名数组:" + Arrays.toString(name));
        return result;
    }

    //    添加学员的方法
    public void addName() {
        Scanner scanner = new Scanner(System.in);
        boolean isAdd = true;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                System.out.print("请输入学生的姓名:");
                name[i] = scanner.next();
                isAdd = false;
            }
        }
        if (isAdd) {
            System.out.println("班级学生已经满了，不能再添加学员");
        }
        System.out.println("学生的姓名数组:" + Arrays.toString(name));
    }

    //删除学员
    public boolean deleteName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的姓名:");
        String findName = scanner.next();
        boolean isDelete = false;
        for (int i = 0; i < name.length; i++) {
            if (findName.equals(name[i])) {
                name[i] = null;
                isDelete = true;
            }
        }
        System.out.println("学生的姓名数组:" + Arrays.toString(name));
        return isDelete;
    }

    //    获取当前学生人数
    public void getSum() {
        int sum = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                sum++;
            }
        }
        System.out.println("当前学生人数sum=" + sum);
    }

    //    结束程序
    public void die() {
        System.exit(0);
    }
}
//5. 写一个学员管理类，有属性：学员姓名数组，有方法：
//        （一）初始化学员方法，传递一个整数代表学生人数，学生姓名由控制台输入，要求只能初始化一次，多次初始化无效
//        （二）修改学员姓名的方法：传递一个参数表示旧名字，一个参数表示新名字，返回修改成功与否
//        （三）添加学员的方法：添加新学员，参数为名字，不能为null，无返回值
//        （四）移除学员的方法：传递名字为要移除的学员，返回移除结果是否成功
//        （五）获取当前学生人数的方法
//        要求学员姓名数组属性不能暴露在外，编写测试类进行测试（提示：注意数组是否为null，以及数组长度会因方法调用而改变）。
