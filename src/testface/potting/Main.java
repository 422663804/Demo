package testface.potting;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setUsername("小天");
        person.setPassword("123546");
        person.setId(3333);
        System.out.println(person.getUsername());
        System.out.println(person.getPassword());
        System.out.println(person.getId());
        System.out.println("---------------------");
        System.out.println(person.getId());

        person.moving("小玲");
    }

}
