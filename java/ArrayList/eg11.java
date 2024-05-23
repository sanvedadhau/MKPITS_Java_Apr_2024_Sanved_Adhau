package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

//11. Write a Java program to reverse elements in an array list.
public class eg11 {
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

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
