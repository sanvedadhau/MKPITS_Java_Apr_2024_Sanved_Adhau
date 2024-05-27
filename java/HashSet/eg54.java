package Collection.Assignment_15.HashSet;

import java.util.*;

//54. Write a Java program to convert a hash set to an array.
public class eg54 {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("Yellow");
        set.add("White");
        set.add("Black");
        set.add("Red");
        set.add("Orange");

        System.out.println("HashSet : "+set);
        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("ArrayList : "+array);

    }
}
