
class Person {
    public String name;
    public String gender;
    public String workAddress;
    public Person[] array;

    public Person() {
    }

    public Person(String name, String gender, String workAddress, Person[] array) {
        this.name = name;
        this.gender = gender;
        this.workAddress = workAddress;
        this.array = array;
    }

    public String[] information() {
        return new String[]{"{姓名:" + name + " 性别:" + gender + " 工作单位:" + workAddress + "};"};
    }
}