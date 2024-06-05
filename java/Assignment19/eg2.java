package StreamDemo.Assignment19;


import java.util.ArrayList;
import java.util.List;

//2. Mapping:
//Create a numbers of integers and use a stream to double each integer in the numbers.
public class eg2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){{
            add(30);
            add(65);
            add(98);
            add(19);
            add(68);
        }};
        System.out.println(list);

        list.stream().map(n->n*2).forEach(System.out::println);
    }
}
