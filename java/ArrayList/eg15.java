package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;

//15. Write a Java program to join two array lists.
public class eg15 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Indigo");
        arrayList1.add("Blue");
        arrayList1.addFirst("Violet");
        arrayList1.add("Green");
        arrayList1.add("Yellow");
        arrayList1.add("Orange");
        arrayList1.add("Red");

        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("जांभळा");
        arrayList2.add("पारवा");
        arrayList2.add("निळा");
        arrayList2.add("हिरवा");
        arrayList2.add("पिवळ");
        arrayList2.add("नारंगी");
        arrayList2.add("तांबडा");

        ArrayList <String> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);
        System.out.println(arrayList3);

    }
}
