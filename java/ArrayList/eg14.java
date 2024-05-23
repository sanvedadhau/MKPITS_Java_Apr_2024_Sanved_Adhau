package Collection.Assignment_15.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//14. Write a Java program that swaps two elements in an array list.
public class eg14 {
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

        Collections.swap(arrayList,0,6);
        System.out.println("After swapping : "+arrayList);
    }
}
