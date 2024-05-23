package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;

//19. Write a Java program for trimming the capacity of an array list.
public class eg19 {
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

//        default size of an arraylist is 10 and increases by formula (n+(n/2)+1) after original filled by 75%
//        use of trimToSize() is done to ensure capacity==size
        arrayList.trimToSize();
        System.out.println(arrayList);

    }
}
