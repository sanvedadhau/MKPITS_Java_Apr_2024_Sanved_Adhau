package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//20. **Flatten a list of lists into a single list.**
public class eg20 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 3));
        list.add(Arrays.asList(4, 5, 6));
        list.add(Arrays.asList(7, 8, 9));

        List<Integer> NewList = list.stream().flatMap(List::stream).toList();
        System.out.println("Merged List: " + NewList);
    }
}
