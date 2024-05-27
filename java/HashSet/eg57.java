package Collection.Assignment_15.HashSet;


import java.util.HashSet;
import java.util.Set;

//57. Write a Java program to compare two hash set.
public class eg57 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Set<Integer> set1 = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);

        System.out.println(set.contains(set1));

    }
}
