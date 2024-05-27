package Collection.Assignment_15.HashSet;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//49. Write a Java program to iterate through all elements in a hash list.
public class eg49 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(5);

        Iterator <Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
