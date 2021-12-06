package demo01.p0507.internet;

public class Internet {
    public String name;
    public String Boss;
    public String[] customer;

    public void newName(String name) {
        for (String s : customer) {
            if (s.equals(name)) {
                System.out.println("网吧老板被查，罚款");
                System.exit(0);
            }
        }
        System.out.println("网吧营业行为正常");
    }
}
//3. 写一个网吧类，有属性：网吧名，网吧老板，上网人员（上网人名字数组），
//有方法：传入未成年人名字，搜查此未成年人是否在该网吧上网，如果在输出网吧老板被查，罚款，否则输出网吧营业行为正常。