package demo01.p0510.people;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "王老六";
        person.gender = "男";
        person.workAddress = "腾讯";
        String str = person.information();
        System.out.printf("{姓名:%s, 性别:%s, 工作单位:%s}\n", person.name, person.gender, person.workAddress);
    }
}
