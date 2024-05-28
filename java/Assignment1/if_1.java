package Assignments.Assignment1;


import java.util.Scanner;

//1.write a program that determine the type of given triangle(equilateral, isosceles or scalene)
// based on its side length using if statement
public class if_1 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the length of three sides : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
         if(a == b && b == c){
             System.out.println("Given triangle is Equilateral");
         } else if (a ==b || b ==c || c==a) {
             System.out.println("Given triangle is Isosceles");
         } else {
             System.out.println("Given triangle is Scalene");
         }
    }
}
