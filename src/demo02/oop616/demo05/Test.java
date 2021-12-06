package demo02.oop616.demo05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("***************************");
        System.out.println("--------1、初始化学员--------");
        System.out.println("--------2、修改学员姓名-------");
        System.out.println("--------3、添加学员----------");
        System.out.println("--------4、移除学员----------");
        System.out.println("--------5、获取学员----------");
        System.out.println("--------0、退出-------------");
        System.out.println("***************************");

        while (true) {
            System.out.print("请选择您的操作:");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    student.setNames();
                    break;
                case 2:
                    student.changeName();
                    break;
                case 3:
                    student.addName();
                    break;
                case 4:
                    student.deleteName();
                    break;
                case 5:
                    student.getSum();
                    break;
                case 0:
                    student.die();
                    break;
                default:
                    System.out.println("您输入的有误!请从新输入:");
                    break;
            }
        }
    }
}
//5. 写一个学员管理类，有属性：学员姓名数组，有方法：
//        （一）初始化学员方法，传递一个整数代表学生人数，学生姓名由控制台输入，要求只能初始化一次，多次初始化无效
//        （二）修改学员姓名的方法：传递一个参数表示旧名字，一个参数表示新名字，返回修改成功与否
//        （三）添加学员的方法：添加新学员，参数为名字，不能为null，无返回值
//        （四）移除学员的方法：传递名字为要移除的学员，返回移除结果是否成功
//        （五）获取当前学生人数的方法
//        要求学员姓名数组属性不能暴露在外，编写测试类进行测试（提示：注意数组是否为null，以及数组长度会因方法调用而改变）。