package testface.potting;

public class Person {
    //1、将属性私有化
    private String username;
    private String password;
    private int id;
    private double priMoney;

    //2、将属性进行封装，set/get方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //3、set/get设置访问条件
        if (0 < id && id < 2000) {
            this.id = id;
        } else {
            System.out.println("您输入的id不合法");
        }
    }

    private double getPriMoney() {
        System.out.println(this.username+"取自己的私房钱");
        return priMoney;
    }

    public void setPriMoney(double priMoney) {
        this.priMoney = priMoney;
    }

    public void moving(String girlFriend){
        System.out.println("小天带着"+girlFriend+"去看电影");
        //私有的方法，只允许在当前类型中被调用
        this.getPriMoney();
        System.out.println("去电影院看电影");
    }
}
