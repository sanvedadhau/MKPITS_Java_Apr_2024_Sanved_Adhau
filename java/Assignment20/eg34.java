package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//34. **Reverse the order of a list of strings.**
public class eg34 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");

        List <String> reverseList = list.stream().sorted(Comparator.reverseOrder()).toList();     //without sorting the list??
        System.out.println(reverseList);
    }
}

