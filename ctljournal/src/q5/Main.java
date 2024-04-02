package q5;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        // Create and set information for three students
        students[0] = new Student();
        students[0].setInfo("John", 20, "123 Main St.");

        students[1] = new Student();
        students[1].setInfo("Alice", 22);

        students[2] = new Student();
        students[2].setInfo("Bob", 18, "456 Elm St.");

        // Display information for all students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students[i].displayInfo();
            System.out.println();
        }
    }
}
