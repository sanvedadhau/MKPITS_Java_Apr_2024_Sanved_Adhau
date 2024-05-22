package stud;

import java.util.Scanner;

public class MyClass {
    public static int greatestNumber(int num1,int num2,int num3){
        if(num1 >= num2 && num1 >= num3 )
            return num1;
        else if (num2 >= num1 && num2 >= num3)
            return num2;
        else
            return num3;
    }
    public static int retFact(int num){
        int fact = 1;
        for(int i=1;i<=num;i++) {
            fact *= i;
        }
            return fact;
    }

    public static void chkPrime(int num){
    }

}




