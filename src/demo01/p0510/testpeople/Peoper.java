package demo01.p0510.testpeople;

class Person {
    public String name;
    public String gender;
    public String workAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Person() {
    }

    public Person(String name, String gender, String workAddress) {
        this.name = name;
        this.gender = gender;
        this.workAddress = workAddress;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", workAddress='" + workAddress + '\'' +
                '}';
    }

    public String information() {
        return "{姓名:" + name + " 性别:" + gender + " 工作单位:" + workAddress + "};";
    }
}