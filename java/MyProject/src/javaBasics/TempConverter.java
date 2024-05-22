package javaBasics;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
//        taking input from the keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius : ");
//        temp can be in decimals
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit is : " +tempF);
    }
}
