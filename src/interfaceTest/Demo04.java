package interfaceTest;

public class Demo04 {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Manage manage = new Manage(singer);
        manage.sing();
        manage.findWork();
        manage.money();
    }
}

interface Powers {
    void sing();//唱歌

    void findWork();//找工作

    void money();//收钱
}

//被代理类 创建一个歌手
class Singer implements Powers {

    @Override
    public void sing() {
        System.out.println("一首晚风献给你们");
    }

    @Override
    public void findWork() {

    }

    @Override
    public void money() {

    }
}

//代理类 创建一个经纪人
class Manage implements Powers {
    private final Powers powers;

    public Manage(Powers powers) {
        this.powers = powers;
    }

    @Override
    public void sing() {
        powers.sing();
    }

    @Override
    public void findWork() {
        System.out.println("经纪人签约合同");
    }

    @Override
    public void money() {
        System.out.println("经纪人收取钱");
    }
}

/*
 * 1.创建一个代理模式和一个被代理模式
 */