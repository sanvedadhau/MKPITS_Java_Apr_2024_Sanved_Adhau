package Collection.Assignment_15.LinkedList;

import java.util.LinkedList;

//31. Write a Java program to insert some elements at the specified position into a linked list.
public class eg31 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2,4);
        linkedList.add(5);

        System.out.println(linkedList);
    }
}
