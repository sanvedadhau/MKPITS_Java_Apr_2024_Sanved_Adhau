package Collection.Assignment_15.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

//25. Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class eg25 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);

        ListIterator<Integer> listIterator = linkedList.listIterator(2);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
