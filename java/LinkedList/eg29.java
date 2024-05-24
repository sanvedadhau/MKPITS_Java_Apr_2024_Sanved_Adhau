package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//29. Write a Java program to insert the specified element at the front of a linked list.
public class eg29 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.addLast(6);
//        linkedList.offerLast(6);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
//        linkedList.addFirst(1);
        linkedList.offerFirst(1);

        System.out.println(linkedList);

    }
}
