package javaBasics;

import java.util.Scanner;

public class FibonachiSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //next int
        int a = 0;              //last int
        int b = 1;              //current int
        int count  = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
