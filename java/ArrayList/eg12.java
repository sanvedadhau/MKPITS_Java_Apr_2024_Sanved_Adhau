package Collection.Assignment_15.ArrayList;

import java.util.ArrayList;

//12. Write a Java program to extract a portion of an array list.
public class eg12 {
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

//        not working
//        arrayList.subList(2,5);
//        System.out.println(arrayList);


        System.out.println(arrayList.subList(2,5));
    }
}
