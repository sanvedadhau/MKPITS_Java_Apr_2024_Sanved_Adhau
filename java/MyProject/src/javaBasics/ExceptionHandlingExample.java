package javaBasics;

import java.sql.SQLOutput;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        //NumberFormatException
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException
        try {
            String str = "hello";
            char ch = str.charAt(8);
            System.out.println("Character at index 8: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}