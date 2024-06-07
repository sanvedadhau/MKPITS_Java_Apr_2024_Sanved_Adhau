package StreamDemo.Assignment20;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//12. **Find the longest string in the list.**
public class eg12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");

        System.out.println(list.stream().max(Comparator.comparing(String::length)));

//        chatGPT
//        String longest = list.stream().reduce((a, b) -> a.length() > b.length() ? a : b).orElse("");
//        System.out.println(longest);
    }
}
