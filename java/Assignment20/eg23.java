package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//23. **Convert a list of integers to an array.**
public class eg23 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for(int i = 1; i <= 50; i++) {
            list.add(i);
        }
        Integer[] array = list.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));
    }
}
