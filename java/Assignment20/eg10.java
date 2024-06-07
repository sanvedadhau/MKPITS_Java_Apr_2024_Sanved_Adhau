package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//10. **Concatenate all strings in the list, separated by commas.
public class eg10 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Amravati","nagpur","pune","AKola");

        String result = strings.stream().collect(Collectors.joining(","));

        System.out.println(result);
    }
}
