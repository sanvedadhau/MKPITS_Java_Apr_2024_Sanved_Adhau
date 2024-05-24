package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//25. Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class eg26 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);

        System.out.println(linkedList.reversed());
    }
}
