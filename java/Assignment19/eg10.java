package StreamDemo.Assignment19;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//10. Infinite Streams:
//Create a stream of random numbers and limit it to generate 10 random numbers.
public class eg10 {
    public static void main(String[] args) {
        List<Object> list =  new Random().ints(0,100).limit(10).boxed().collect(Collectors.toList());
        System.out.println(list);
    }

}

