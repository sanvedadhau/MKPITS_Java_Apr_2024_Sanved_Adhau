package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;
import java.util.ListIterator;

//2. Write a Java program to iterate through all elements in an array list.
public class eg2 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add(2,"Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");
        System.out.println(arrayList);

        System.out.println("Using iterator : ");
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("listIterator : ");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
