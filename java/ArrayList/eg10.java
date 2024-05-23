package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;
import java.util.Collections;

//10. Write a Java program to shuffle elements in an array list.
public class eg10 {
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

//        sorting the arrayList
        Collections.sort(arrayList);
        System.out.println("Sorted list : "+arrayList);

//        shuffling the arrayList
        Collections.shuffle(arrayList);
        System.out.println("List After shuffling : "+arrayList);

    }
}
