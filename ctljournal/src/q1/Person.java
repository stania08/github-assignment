package q1;

//R/BCA-22-243


import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getData() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name for person 1: ");
        String name = scan.nextLine();
        System.out.print("Enter age for person 1: ");
        int age = Integer.parseInt(scan.nextLine());
        //scan.nextLine(); 

        Person person1 = new Person(name, age);

        System.out.print("Enter name for person 2: ");
        name = scan.nextLine();
        System.out.print("Enter age for person 2: ");
        age = Integer.parseInt(scan.nextLine());

        Person person2 = new Person(name, age);

        System.out.println("Person 1 - " + person1.getData());
        System.out.println("Person 2 - " + person2.getData());

        scan.close();
    }
}
