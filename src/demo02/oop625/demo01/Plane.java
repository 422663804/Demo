package demo02.oop625.demo01;

public class Plane {
    public void fly() {
        System.out.println("飞机的飞翔方法");
    }

}
//1. 创建一个飞机类（Plane），有fly飞的方法；创建一个超人类（Superman），有fly飞的方法；创建一个鸟类（Bird），有fly飞的方法，创建测试类（Test），有测试方法test，要求：
//        （一）重载方法test，参数为飞机对象，调用飞机的fly方法
//        （二）重载方法test，参数为超人对象，调用超人的fly方法
//        （三）重载方法test，参数为鸟对象，调用鸟的fly方法
//        （四）重载方法test，参数为Object类对象，判断参数是否为飞机/超人/鸟类型，如果是则调用对应的fly方法，否则输出“这是什么鸟？飞不了！”
//        （五）创建各种对象，测试所有的方法，确保所有的方法都能调用到。（提示：第四个方法注意编译期类型和运行期类型）
