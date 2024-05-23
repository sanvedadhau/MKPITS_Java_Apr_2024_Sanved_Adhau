package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;

//3. Write a Java program to insert an element into the array list at the first position.
public class eg3 {
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

    }
}
