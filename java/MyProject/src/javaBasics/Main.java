package javaBasics;

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create instances of Contractor and FullTimeEmployee
        Contractor contractor = new Contractor("John", 25.0, 50);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 30.0, 45);

        // Calculate and print salaries
        System.out.println("Contractor Employee Salary: $ " + contractor.calculateSalary());
        System.out.println("Full Time Employee Salary: $" + fullTimeEmployee.calculateSalary());
    }
}