package q5;

class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

