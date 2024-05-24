package Collection.Assignment_15.LinkedList;

import java.util.LinkedList;

//28. Write a Java program to insert elements into the linked list at the first and last positions.
public class eg28 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.addLast(6);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(1);

        System.out.println(linkedList);
    }
}
