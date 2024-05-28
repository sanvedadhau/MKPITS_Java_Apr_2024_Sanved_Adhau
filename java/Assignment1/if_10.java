package Assignments.Assignment1;

import java.util.Scanner;

public class if_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        if (angle > 0 && angle < 90) {
            System.out.println("The angle is acute.");
        } else if (angle == 90) {
            System.out.println("The angle is right.");
        } else if (angle > 90 && angle < 180) {
            System.out.println("The angle is obtuse.");
        } else if (angle == 180) {
            System.out.println("The angle is straight.");
        } else {
            System.out.println("Invalid angle. Please enter an angle between 0 and 180 degrees.");
        }

    }
}
