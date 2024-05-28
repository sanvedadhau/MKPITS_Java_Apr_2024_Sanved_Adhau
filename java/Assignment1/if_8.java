package Assignments.Assignment1;

import java.util.Scanner;

public class if_8 {
    public static void main(String[] args) {
        int Tea = 10;
        int Coffee = 15;
        int Samosa = 20;
        int choice;
        double tip = 0.10;
        double tax = 0.05;
        double totAmm;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number for order (1,2,3)");
        System.out.println("Enter 1 for Tea");
        System.out.println("Enter 2 for Coffee");
        System.out.println("Enter 3 for Samosa");
        System.out.print("Place your order : ");
        choice = scanner.nextInt();


        if(choice == 1 ){
            System.out.println("your Tea costs :  "+Tea);
            totAmm = Tea+((Tea*tip)+(Tea*tax));
            System.out.println("Total Amount including tip and tax is : "+totAmm);
        } else if (choice == 2) {
            System.out.println("your Coffee costs :  "+Coffee);
            totAmm = Coffee+((Coffee*tip)+(Coffee*tax));
            System.out.println("Total Amount including tip and tax is : "+totAmm);
        } else if (choice == 3) {
            System.out.println("your Samosa costs :  "+Samosa);
            totAmm = Samosa+((Samosa*tip)+(Samosa*tax));
            System.out.println("Total Amount including tip and tax is : "+totAmm);
        }else {
            System.out.println("Invalid response");
        }
    }
}
