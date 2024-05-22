package javaBasics;

import java.util.Scanner;

public class MaxMinOfThree {
    public static void main(String[] args) {
        System.out.println("Enter the three number's : ");
//        taking 3 input
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        checking max out of 3

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//
//        System.out.println(max);

//        using Math.max class
        int max = 0;
        max = Math.max(a,b);
        if (c > max){
            max = c;
        }
        System.out.println("max : "+max);

        System.out.println("-------------");


//        int min = a;
//        if (b < min){
//            min = b;
//        }
//        if (c < min){
//            min = c;
//        }
//        System.out.println(min);

//        using Math.min class
       int min = 0;
       min = Math.min(a,b);
       if (c < min){
           min = c;
       }
        System.out.println("min : "+min);
    }
}
