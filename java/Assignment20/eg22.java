package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.List;

//22. **Find the first string that starts with the letter 'A'.**
public class eg22 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("AKola","Amravati","nagpur", "sanved","pune");

        String firstWithA = strings.stream()
                .filter(n -> n.startsWith("A") || n.startsWith("a")).findFirst().orElse("");

        System.out.println(firstWithA);

    }
}
