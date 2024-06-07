package StreamDemo.Assignment20;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//13. **Group a list of strings by their length.**
public class eg13 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Amravati","nagpur", "sanved","pune","AKola");

        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));
    }
}
