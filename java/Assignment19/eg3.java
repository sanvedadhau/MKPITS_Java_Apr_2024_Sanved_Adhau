package StreamDemo.Assignment19;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3. Sorting:
//Create a numbers of strings and use a stream to sort them in ascending order.
public class eg3 {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("Amravati","nagpur","pune","AKola", "Gandhinagar");
        System.out.println(list);
        list.stream().sorted().forEach(System.out::println);

    }
}
