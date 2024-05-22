package javaBasics;   // code is present in javaBasics package(folder)

// public is access modifier that ensures that the class can be access from anywhere
// class is a collection of named group and functions
// HelloWorld is a name of a file
public class HelloWorld {
    // program will start from the "main" function
    // main should be accessible from anywhere, so we make main public

    // static is used so that we can run main function without creating object of class main
    // object creation in java
    // HelloWorld obj = new HelloWorld();
    // obj.main();
    // if the program starts from the main function how can object runs before main
    // that's why we use static before writing main function

    // void is a return type in java that returns nothing
    // return values are those value which are given when program executes int gives int, void gives nothing

    // (String[] args) these are the command line arguments
    public static void main(String[] args) {

        // System is class
        // out is variable in System class
        // println is a print stream ctrl+click on println for more info
        // println will take string and shoe it in output
        // System.out is default output stream
        System.out.println("Hello World!");
    }
} 