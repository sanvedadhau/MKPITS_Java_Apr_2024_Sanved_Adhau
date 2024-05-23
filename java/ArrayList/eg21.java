package Collection.Assignment_15.ArrayList;

import java.util.ArrayList;

//21. Write a Java program to replace the second element of an ArrayList with the specified element.
public class eg21 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("xyz");
        System.out.println(arrayList);

        arrayList.set(1,"def");
        System.out.println(arrayList);
    }
}
