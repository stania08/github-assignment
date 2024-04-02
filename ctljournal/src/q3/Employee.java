package q3;

//R/BCA-22-243

public class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;

    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        double DA = 0.10 * basicSalary;
        double HRA = 5000;
        double totalSalary = basicSalary + DA + HRA;
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (DA): " + DA);
        System.out.println("House Rent Allowance (HRA): " + HRA);
        System.out.println("Total Salary: " + totalSalary);
        
        return DA;
    }

    public void updateSalary(double newBasicSalary) {
        basicSalary = newBasicSalary;
        System.out.println("Salary updated for " + name + ". New Basic Salary: " + basicSalary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Manager", 50000);
        

        System.out.println("Employee 1 Details:");
        employee1.calculateSalary();

    }
}
