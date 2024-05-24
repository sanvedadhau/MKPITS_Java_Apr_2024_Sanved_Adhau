package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//27. Write a Java program to insert the specified element at the specified position in the linked list.
public class eg27 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        linkedList.set(1,6);
//        linkedList.add(0,7);              //add will add the number at given index and push the list
        System.out.println(linkedList);
    }
}
