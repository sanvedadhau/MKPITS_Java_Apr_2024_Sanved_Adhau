package Collection.Assignment_15.LinkedList;


import java.util.LinkedList;
import java.util.Scanner;

//34. Write a Java program to remove a specified element from a linked list.
public class eg34 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addFirst(1);

        System.out.println(linkedList);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index : ");
        int i = scanner.nextInt();
        linkedList.remove(i);
        System.out.println(linkedList);
    }
}
