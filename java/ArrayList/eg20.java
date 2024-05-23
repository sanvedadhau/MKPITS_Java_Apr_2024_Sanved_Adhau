package Collection.Assignment_15.ArrayList;

import java.util.ArrayList;

//20. Write a Java program to increase an array list size.
public class eg20 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.addFirst("Violet");
        System.out.println("Before capacity increase : "+arrayList);

        arrayList.ensureCapacity(6);

        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");
        System.out.println("After capacity increase : "+arrayList);

    }
}
