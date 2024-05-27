package Collection.Assignment_15.HashSet;


import java.util.HashSet;
import java.util.Set;

//53. Write a Java program to clone a hash set to another hash set.
public class eg53 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(5);

        Set<Integer> setClone = new HashSet<>(set);
//        setClone = (HashSet)set.clone();
        System.out.println(setClone);
    }
}
