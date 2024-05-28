package Assignments.Assignment1;

import java.util.Scanner;

public class if_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter the total allowances: ");
        double allowances = scanner.nextDouble();

        System.out.print("Enter the total deductions: ");
        double deductions = scanner.nextDouble();

        double grossSalary = basicSalary + allowances;

        double netSalary = grossSalary - deductions;

        if (netSalary < 0) {
            System.out.println("Invalid response");
        } else {
            System.out.printf("The net salary is: %.2f", netSalary);
        }

    }
}
