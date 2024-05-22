package javaBasics;

import java.util.Scanner;

public class AgeOutOfRangeException extends Exception {
    private int age;

    public AgeOutOfRangeException(int age) {
        super("Age must be between 0 and 100");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class AgeChecker {
    public static void checkAge(int age) throws AgeOutOfRangeException {
        if (age < 0 || age > 100) {
            throw new AgeOutOfRangeException(age);
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        try {
            int age = scanner.nextInt();
            checkAge(age);
        } catch (AgeOutOfRangeException e) {
            System.out.println(e.getMessage() + " Given age: " + e.getAge());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age as a number.");
        } finally {
            scanner.close();
        }
    }
}

