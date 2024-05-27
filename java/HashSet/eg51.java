package Collection.Assignment_15.HashSet;


import java.util.HashSet;
import java.util.Set;

//51. Write a Java program to empty an hash set.
public class eg51 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(5);

        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
