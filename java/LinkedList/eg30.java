package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//30. Write a Java program to insert the specified element at the end of a linked list.
public class eg30 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
//        linkedList.addFirst(1);
        linkedList.offerFirst(1);
        linkedList.offerLast(7);
        linkedList.addLast(6);               //addLAst is the methode of queue works same as add

        System.out.println(linkedList);
    }
}
