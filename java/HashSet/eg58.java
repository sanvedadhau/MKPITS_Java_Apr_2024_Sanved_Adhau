package Collection.Assignment_15.HashSet;

import java.util.HashSet;
import java.util.Set;

//58. Write a Java program to compare two sets and retain elements that are the same.
public class eg58 {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);

//        using anonymous inner class
        Set <Integer> set1 = new HashSet<Integer>(){{
            add(3);
            add(4);
            add(5);
        }};

        Set <Integer> set2 = new HashSet<>(set);
        set2.retainAll(set1);
        System.out.println("Intersection of set : "+set2);

    }
}
