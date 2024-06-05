package StreamDemo.Assignment19;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//8. FlatMap:
//Create a numbers of lists of integers and use a stream to flatten the structure
// (i.e., merge all the lists into one) and then calculate the sum of all the integers.
public class eg8 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 3));
        list.add(Arrays.asList(4, 5, 6));
        list.add(Arrays.asList(7, 8, 9));

        List<Integer> NewList = list.stream().flatMap(List::stream).toList();

        int sum = NewList.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Merged List: " + NewList);
        System.out.println("Sum of Integers: " + sum);
    }
}