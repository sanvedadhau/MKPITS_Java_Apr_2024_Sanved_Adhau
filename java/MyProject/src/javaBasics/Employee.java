package javaBasics;


// Abstract class Employee
abstract class Employee {
    String name;
    double paymentPerHour;

    // Constructor
    Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();
}

// Subclass Contractor extending Employee
class Contractor extends Employee {
    int workingHours;

    // Constructor
    Contractor(String name, double paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    // Override calculateSalary method for Contractor
    @Override
    double calculateSalary() {
        // For contractors, salary is calculated as paymentPerHour * workingHours
        return paymentPerHour * workingHours;
    }
}

// Subclass FullTimeEmployee extending Employee
class FullTimeEmployee extends Employee {
    int workingHours;

    // Constructor
    FullTimeEmployee(String name, double paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    // Override calculateSalary method for FullTimeEmployee
    @Override
    double calculateSalary() {
        // For full-time employees, salary is calculated as paymentPerHour * workingHours * 40 (assuming 40 hours per week)
        return paymentPerHour * workingHours * 40;
    }
}
