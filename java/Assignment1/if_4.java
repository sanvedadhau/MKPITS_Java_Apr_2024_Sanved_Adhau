package Assignments.Assignment1;

import java.util.Scanner;

//4.Write a program that determines the eligibility of a person for a discount based on their total purchase
public class if_4 {
    public static void main(String[] args) {
        double billAmm, dis, disAmm;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter total bill amount : ");
        billAmm = scanner.nextDouble();
        dis = 10;
        if(billAmm > 1000){
            disAmm = billAmm - dis;
            System.out.print("Yoe are eligible for the discount, Discounted amount : "+disAmm);
        }else {
            System.out.println("You are not eligible for discount, Total amount : ");
        }
    }
}
