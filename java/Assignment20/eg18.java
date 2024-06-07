package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//18. **Convert a list of integers to a list of their string representations.**
public class eg18 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(96);

        System.out.println(list);

        List<String> stringNumbers = list.stream().map(String::valueOf).collect(Collectors.toList());

        System.out.println(stringNumbers);
    }
}
