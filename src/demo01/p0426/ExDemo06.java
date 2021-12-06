package demo01.p0426;

public class ExDemo06 {
    public static void main(String[] args) {
        ClassGroup classGroup = new ClassGroup();
        classGroup.say();
        Headmaster headmaster = new Headmaster();
        headmaster.show();
    }
}

//班集体
class ClassGroup {
    public String name = "德智班";
    public int sum = 30;

    public void say() {
        System.out.println("班级名:" + name + " 班级人数:" + sum);
    }
}
//班主任
class Headmaster {
    public String name = "James Gosling";
    public String classID = "德智班";

    public void show() {
        System.out.println("班主任名称:" + name + " 所管理的班级:" + classID);
    }
}

//写一个[班集体]类，有属性:班级名，班级人数;再写一个[班主任]类，具有属性:名字、所管理的班。编写测试。