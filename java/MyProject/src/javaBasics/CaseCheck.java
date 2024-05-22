package javaBasics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        we can't take char as ip??
//        trim() is used to cut off extra spaces in the input
//        charAt() we are giving index for the char
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }
}
