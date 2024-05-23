package Collection.Assignment_15.ArrayList;


//6. Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class eg6 {
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

//        removing elements from the arrayList
        System.out.println("Removed element from index : "+arrayList.remove(3));
        arrayList.remove("Blue");

        System.out.println(arrayList);
    }
}
