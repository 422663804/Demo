package testface;

public class SuperMarket {
    public String name;

    public SuperMarket() {
    }

    public SuperMarket(String name) {
        this.name = name;
    }

    public SoySauce saleSoySauce(double money) {
        System.out.println(this.name + "超市收银:" + money + "元");
        SoySauce ss = new SoySauce("海天酱油");
        System.out.println("售出一瓶:" + ss.name);
        return ss;
    }
}
