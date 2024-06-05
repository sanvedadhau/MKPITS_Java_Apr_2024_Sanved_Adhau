package StreamDemo.Assignment19;


//5. Grouping and Counting:
//Create a numbers of strings and use a stream to group them by their length,
//and then count the number of strings in each group.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class eg5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("ab");
        list.add("cd");
        list.add("xy");
        list.add("abc");
        list.add("mno");
        list.add("xyz");
        list.add("mnop");

        // Group strings by their lengthWord
        Map<Integer, Long> lengthWord = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));

        lengthWord.forEach((length, count) -> System.out.println("Length " + length + ": " + count));
    }
}

