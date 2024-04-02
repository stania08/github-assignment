package q6;

import java.util.Scanner;

class Teachers {
    String type;

    public Teachers(String type) {
        this.type = type;
    }

    public void Teaches() {
        System.out.println("The teacher is teaching " + type);
    }
}

class TeacherTeaches extends Teachers {
    String name;

    public TeacherTeaches(String name, String type) {
        super(type);
        this.name = name;
    }

    public void Subjects() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subject: ");
        String subject = scanner.nextLine();
        scanner.close();

        System.out.println("Teacher " + name + " is teaching " + subject);
    }
}

