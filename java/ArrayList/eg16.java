package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;

//16. Write a Java program to clone an array list to another array list.
public class eg16 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.addFirst("Violet");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        ArrayList<String>arrayList2 = new ArrayList<>();
//        arrayList2=(arrayList)arrayList2.clone();
        System.out.println(arrayList2);

    }
}
