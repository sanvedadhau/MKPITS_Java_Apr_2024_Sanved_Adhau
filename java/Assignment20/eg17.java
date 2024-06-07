package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.Random;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;

//17. **Find the second-highest number in a list of integers.**
public class eg17 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        List<Object> list =  new Random().ints(1,100).limit(10).boxed().collect(Collectors.toList());
//        System.out.println(list);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
    }
}
