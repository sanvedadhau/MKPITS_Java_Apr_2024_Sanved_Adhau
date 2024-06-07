package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//28. **Join a list of strings with a custom separator.**
public class eg28 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");

        String listSperator = list.stream().collect(Collectors.joining(" - "));
        System.out.println(listSperator);
    }
}
