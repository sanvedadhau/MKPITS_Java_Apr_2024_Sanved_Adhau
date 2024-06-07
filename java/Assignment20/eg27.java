package StreamDemo.Assignment20;


import java.util.Arrays;
import java.util.List;

//27. **Find the string with the minimum length.**
public class eg27 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");

        String minLengthString = list.stream().reduce((m, n) -> m.length() < n.length() ? m : n).orElse("");
        System.out.println(minLengthString);
    }
}
