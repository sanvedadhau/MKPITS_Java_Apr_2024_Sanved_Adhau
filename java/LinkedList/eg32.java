package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//32. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class eg32 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(1);
        linkedList.add(1);
        linkedList.add(5);

//        System.out.println(linkedList.occ);

        // Find first element of the List
        Object first_element = linkedList.getFirst();
        System.out.println("First Element is: "+first_element);

        // Find last element of the List
        Object last_element = linkedList.getLast();
        System.out.println("Last Element is: "+last_element);
    }
}
