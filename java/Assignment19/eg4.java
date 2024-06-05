package StreamDemo.Assignment19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4. Combining Operations:
//Create a numbers of integers and use a stream to filter out the even numbers,
// double each remaining number, and then find the sum of the doubled numbers.
public class eg4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){{
            add(30);
            add(65);
            add(98);
            add(19);
            add(68);
        }};
        System.out.println(list);

        int sum = list.stream().filter(n->n%2!=0).mapToInt(n->n*2).sum();
        System.out.println(sum);

    }
}
