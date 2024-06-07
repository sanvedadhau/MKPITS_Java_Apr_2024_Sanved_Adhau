package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//5. **Sort a list of strings alphabetically.
public class eg5 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("xyr");
        list.add("abc");
        list.add("uijehb");
        list.add("pdn");

        list.stream().sorted().toList().forEach(System.out::println);

    }
}
