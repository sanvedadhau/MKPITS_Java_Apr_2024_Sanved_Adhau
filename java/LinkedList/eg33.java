package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;

//33. Write a Java program to display elements and their positions in a linked list.
public class eg33 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(1);

        System.out.println("Original linked list:" + linkedList);
        for(int i=0; i < linkedList.size(); i++)
        {
            System.out.println("Element at index "+i+": "+linkedList.get(i));
        }
    }
}
