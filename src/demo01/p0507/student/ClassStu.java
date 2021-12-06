package demo01.p0507.student;


public class ClassStu {
    public String className = "混元太极";
    public String teacherName = "马某国";
    public Student[] allaySut; //学生数组

    //获得班级所有学生的平均年龄
    public void age() {
        int sum = 0;
        for (Student student : allaySut) {
            sum += student.age;
        }
        int average = sum / (allaySut.length);
        System.out.println("班级平均年龄average=" + average);
    }

    //获得班级的所有学生总成绩
    public void sumScore() {
        int sum = 0;
        for (Student student : allaySut) {
            sum += student.score;
        }
        System.out.println("总成绩sum=" + sum);
    }

    //获得班级男女比例的方法
    public void scale() {
        int boy = 0;
        int girl = 0;
        for (int i = 0; i < allaySut.length; i++) {
            if (allaySut[i].gender.equals("男")) {
                boy++;
            }
            if (allaySut[i].gender.equals("女")) {
                girl++;
            }
        }
        System.out.println("班级男女比例=" + boy + ":" + girl);
    }

    public void getInfo() {
        for (Student student : allaySut) {
            System.out.println("班级的名称:" + className + " 班主任姓名为:" + teacherName + "  学生姓名为:" + student.name + " 性别:" + student.gender + " 成绩:" + student.score + " 年龄：" + student.age);
        }
    }

    public void find(String name) {
        for (int i = 0; i < allaySut.length; i++) {
            if (name.equals(allaySut[i].name)) {
                System.out.println(name + "这位学生在此班级");
                System.exit(0);
            }
        }
        System.out.println(name + "这位学生不在此班级！");
    }
}

//4. 写一个学生类，属性：学生姓名、性别、考试成绩、年龄；
//   写一个班级类，属性：班级名、班主任名字、所有的学生（数组）。
//   班级类有方法：
//        （一）获得班级所有学生的平均年龄；
//        （二）获得班级的所有学生总成绩；
//        （三）获得班级男女比例的方法。

//        测试要求：创建班级对象请使用控制台循环输入班级学生的姓名、性别（char赋值可以使用整数强制转换而来）、成绩和年龄。

//5. 思考题：在上一题的基础上实现以下方法：
//        方法1：输出班级信息的getInfo方法，该方法输出班级相关信息以及所有学生的信息；
//        方法2：根据姓名查找学生是否在此班级里的find方法，传递一个学生姓名，查找该学生是否在此班级。

