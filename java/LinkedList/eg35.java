package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//35. Write a Java program to remove the first and last elements from a linked list.
public class eg35 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(1);

        System.out.println(linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

    }
}
