package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//8. Write a Java program to sort a given array list.
public class eg8 {
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

//       sorting the arrayList
        Collections.sort(arrayList);
        System.out.println("Sorted list : "+arrayList);

//        using comparator
        arrayList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list in reverse order : "+arrayList);
    }
}
