package StreamDemo.Assignment19;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//7. Using Predicates:
//Create a numbers of integers and use a stream to filter out numbers greater than 10 using a custom predicate.
public class eg7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){{
            add(30);
            add(6);
            add(98);
            add(9);
            add(68);
        }};

        list.stream().filter(n->n>10).toList().forEach(System.out::println);

    }
}
