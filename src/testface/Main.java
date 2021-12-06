package testface;

public class Main {
    public static void main(String[] args) {
        //小明去超市打酱油
        Person person = new Person("小明");
        SuperMarket sm = new SuperMarket("万达");

        //小明从超市购买酱油
        SoySauce ss = person.buy(10,sm);
    }
}
