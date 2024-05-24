package Collection.Assignment_15.LinkedList;


import java.util.Iterator;
import java.util.LinkedList;

//24. Write a Java program to iterate through all elements in a linked list.
public class eg24 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Iterator<Integer>iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
