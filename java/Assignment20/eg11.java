package StreamDemo.Assignment20;


import java.util.Arrays;
import java.util.List;

//11. **Filter out strings with length less than 5.**
public class eg11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");

        list.stream().filter(n -> n.length() <= 5).toList().forEach(System.out::println);
    }
}
