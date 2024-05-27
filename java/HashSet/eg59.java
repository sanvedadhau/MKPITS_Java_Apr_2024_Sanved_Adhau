package Collection.Assignment_15.HashSet;


import java.util.HashSet;
import java.util.Set;

//59. Write a Java program to remove all elements from a hash set.
public class eg59 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        set.removeAll(set);
        System.out.println(set);

    }
}
