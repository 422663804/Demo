package demo02.oop625.demo02;

public class TestGame {
    public static void main(String[] args) {
        Game game = new Game(new Plant[4]);
        Plant plant = new Plant();
        plant.attack();
        game.add(new Radish());
        game.add(new Potato());
        game.add(new Pumpkin());
        game.add(new Sunflower());
        game.play();
    }
}
//2. 植物僵尸大战Java版：不同的植物攻打前进的僵尸，不同植物攻击速度、攻击方式各不相同，要求：
//        （一）创建一个植物父类(Plant)，有方法attack攻击，输出内容：“植物以速度0攻击僵尸”
//        （二）创建四种植物子类，要求重写attack方法：南瓜（攻击速度每秒/10点血）, 土豆（攻击速度每秒/15点血）, 萝卜（攻击速度每秒/12点血）, 向日葵（攻击速度每秒/6点血）

//        （三）创建一个游戏(Game)类：
//        1). 带参数构造方法：Game(int)，传递一个游戏中植物总数量的参数

//        2). 属性一：能容纳三种植物对象的数组plants，长度为构造函数传递的参数，使用final修饰确保不变
//           分析：对数组进行final
//        3). 属性三：统计当前数组中植物对象个数的属性count

//        4). 方法一：添加植物的方法add(Plant)
//        5). 方法二：循环调用数组中的植物攻击僵尸的方法play
//        （四）测试：在main方法内创建四个值物: 南瓜、土豆、萝卜、向日葵，创建游戏对象，添加这四个植物，调用play方法。
