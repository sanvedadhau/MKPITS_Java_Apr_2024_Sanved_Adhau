package Collection.Assignment_15.ArrayList;


import java.util.ArrayList;

//22. Write a Java program to print all the elements of an ArrayList using the elements' position.
public class eg22 {
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

        for(int i=0;i< arrayList.size();i++){
            System.out.println("printing by element : "+arrayList.get(i));
        }

//        using for each methode
        arrayList.forEach(System.out::println);

    }
}
