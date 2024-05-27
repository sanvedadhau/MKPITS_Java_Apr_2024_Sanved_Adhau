package Collection.Assignment_15.HashSet;


import java.util.HashSet;
import java.util.Set;

//50. Write a Java program to get the number of elements in a hash set.
public class eg50 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(5);

        System.out.println(set.size());
    }
}
