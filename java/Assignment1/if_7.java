package Assignments.Assignment1;

import java.util.Scanner;

public class if_7 {
    public static void main(String[] args) {
        double entScr, preAcd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the entrance score : ");
        entScr = scanner.nextDouble();
        System.out.print("Enter the previous academic score : ");
        preAcd = scanner.nextDouble();
        if(entScr >= 80 && preAcd >= 70){
            System.out.println("You are eligible for admission");
        }else{
            System.out.println("You are not eligible for admission");
        }
    }
}
