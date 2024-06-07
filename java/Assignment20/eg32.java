package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//32. **Calculate the total length of all strings in the list.**
public class eg32 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");

        String listConcat = list.stream().collect(Collectors.joining(""));
        System.out.println(listConcat);

        int legth= list.stream().collect(Collectors.joining("")).length();
        System.out.println(legth);

    }
}
