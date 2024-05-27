package Collection.Assignment_15.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//55. Write a Java program to convert a hash set to a tree set.
public class java55 {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("HashSet : "+set);

        Set <Integer> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet : "+treeSet);
//        for(Integer contains : treeSet){
//            System.out.println(contains);
//        }
    }
}
