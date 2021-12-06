package testface;

public class Person {
    public String name;

    public void buy(){

    }

    public Person(String name) {
        this.name = name;
    }

    public SoySauce buy(double money, SuperMarket sm){
        //小明去购买行为
        System.out.println(this.name+"拿着"+money+"去超市买酱油");

        //调用超市售货行为
        SoySauce ss = sm.saleSoySauce(money);
        System.out.println("小明购买到了一瓶:"+ss.name+"酱油");
        System.out.println("购买结果:"+ss.name);
        return ss;
    }
}
