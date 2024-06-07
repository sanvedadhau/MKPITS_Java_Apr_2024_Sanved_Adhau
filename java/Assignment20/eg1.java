package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//1. **Filter out even numbers from a list of integers.
public class eg1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            list.add(i);
        }

        list.stream().filter(n-> n % 2 == 0).toList().forEach(System.out::println);
    }
}
