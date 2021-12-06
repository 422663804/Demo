package demo01.p0510.people;

public class Person {
    public String name;
    public String gender;
    public String workAddress;

    public String information() {
        String str = "{姓名:" + name + " 性别:" + gender + " 工作单位:" + workAddress + "}";
        return str;
    }
}

//6. 创建一个员工类有属性：姓名、性别、工作单位，该类有一个方法：输出返回员工基本信息，该方法返回一个字符串类似："{姓名:王老六,性别:男,工作:腾讯}"，
//编写代码实现这个类。（可以使用 printf 或者 String.format 方法）