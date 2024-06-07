package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//31. **Sort a list of strings by their lengths.**
public class eg31 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");
        System.out.println(list.stream().sorted().collect(Collectors.groupingBy(String::length)));

    }
}
