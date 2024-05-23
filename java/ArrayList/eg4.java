package Collection.Assignment_15.ArrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.Scanner;

public class eg4 {
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

//        using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of colour(1  to  7 ) : ");
        int index = scanner.nextInt();
        System.out.println(arrayList.get(index));

//        specific index
        System.out.println("First Element : " + arrayList.getFirst());
        System.out.println("Using get() method : "+arrayList.get(5));
    }
}
