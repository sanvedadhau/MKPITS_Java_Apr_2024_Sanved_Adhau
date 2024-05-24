package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//36. Write a Java program to remove all elements from a linked list.
public class eg36 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(1);

        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
    }
}
