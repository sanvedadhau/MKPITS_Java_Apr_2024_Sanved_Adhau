package Collection.Assignment_15.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//5. Write a Java program to update an array element by the given element.

public class eg5 {
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

//        setting 3rd element as White
        arrayList.set(2, "White");
        System.out.println(arrayList);
    }
}
