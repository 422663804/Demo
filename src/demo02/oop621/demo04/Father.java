package demo02.oop621.demo04;

public class Father {
    private String father;
    private static String child;
    public int num = 88;

    {
        System.out.println("初始化块后执行");
    }

    static {
        System.out.println("静态代码块先执行");
    }

    public Father() {
    }

    public Father(String father) {
        this.father = father;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public static String getChild() {
        return child;
    }

    public static void setChild(String child) {
        Father.child = child;
    }

    @Override
    public String toString() {
        return "Father{" +
                "father='" + father + '\'' +
                ", num=" + num +
                '}';
    }
}
//思考题，编写子类和父类，要求子类和父类都包含：普通属性、静态属性、初始化块、静态代码块以及构造函数。
//        通过测试总结子类实例化过程中每个部分的调用先后顺序。
//        提示：属性不能打印内容到控制台，可以通过方法。
