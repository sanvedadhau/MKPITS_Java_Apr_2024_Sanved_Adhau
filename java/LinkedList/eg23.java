package Collection.Assignment_15.LinkedList;

import java.util.LinkedList;

//23. Write a Java program to append the specified element to the end of a linked list.
public class eg23 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

    }
}
