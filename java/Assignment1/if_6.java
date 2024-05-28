package Assignments.Assignment1;

import java.util.Scanner;

public class if_6 {
    public static void main(String[] args) {
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your BMI : ");
        bmi = scanner.nextDouble();
        if(bmi <= 18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal Weight");
        } else if (bmi >= 24.9 && bmi <=29.9) {
            System.out.println("Over Weight");
        }else {
            System.out.println("Obese");
        }
    }
}
