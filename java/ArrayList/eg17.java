package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;

//17. Write a Java program to empty an array list.
public class eg17 {
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

        System.out.println(arrayList.isEmpty());
//        arrayList.clear();
        arrayList.removeAll(arrayList);
        System.out.println(arrayList.isEmpty());
    }
}
