package Collection.Assignment_15.ArrayList;


import java.util.*;

//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class eg1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        System.out.println("Size of the arrayList "+arrayList.size());
        arrayList.add(0,"Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");
        arrayList.add("WhiteSomeThing");
        arrayList.set(6,"White");
        System.out.println("Using sout :"+arrayList);

        System.out.println("Using for loop : ");
        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("Using for each each : ");
        for (Object o : arrayList){
            System.out.println(o);
        }

//          accessing the elements of array list
        System.out.println("Size of the arrayList "+arrayList.size());
        System.out.println("Retrieve an element from the given position");
    }
}
