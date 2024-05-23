package Collection.Assignment_15.ArrayList;


//7. Write a Java program to search for an element in an array list.

import java.util.ArrayList;
import java.util.Scanner;

public class eg7 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.addFirst("Violet");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");
        System.out.println(arrayList);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        String str = scanner.nextLine();
//        using if else and contains() method for searching
        if(arrayList.contains(str)){
            System.out.println("Given colour "+str+" is present in the list!");
        } else {
            System.out.println("Given colour "+str+" is not present in the list!");
        }
    }
}
