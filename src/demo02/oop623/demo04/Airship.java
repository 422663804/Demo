package demo02.oop623.demo04;


public class Airship {
    private String name;
    private static int x = 0;
    private static int y = 0;
    private static int z = 0;

    public Airship() {
    }

    public Airship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //    向上
    public void up() {
        z++;
        System.out.println(this.name + "向上移动后坐标 x=" + x + " y=" + y + " z=" + z);
    }

    //    向下
    public void down() {
        z--;
        System.out.println(this.name + "向下移动后坐标 x=" + x + " y=" + y + " z=" + z);
    }

    //    向左
    public void left() {
        x++;
        System.out.println(this.name + "向左移动后坐标 x=" + x + " y=" + y + " z=" + z);
    }

    //    向右
    public void right() {
        x--;
        System.out.println(this.name + "向右移动后坐标 x=" + x + " y=" + y + " z=" + z);
    }

    //    向前
    public void ahead() {
        y++;
        System.out.println(this.name + "向前移动后坐标 x=" + x + " y=" + y + " z=" + z);
    }

    //    先后
    public void back() {
        y--;
        System.out.println(this.name + "向后移动后坐标 x=" + x + " y=" + y + " z=" + z);
    }
}
//4. 设计一个飞船类，有名字属性，有方法：控制往上、下、左、右方向、控制前进、后退方向等方法；
//        设计一个控制器类，有方法：控制往上、下、左、右方向、控制前进、后退方向等方法；
//        思考：你觉得飞船类和控制器类有什么关系？如何设计比较合理？动手试试。
