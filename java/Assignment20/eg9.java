package StreamDemo.Assignment20;

import java.util.Arrays;
import java.util.List;

//9. **Check if any string in the list contains the letter 'a'.
public class eg9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","nagpur","pune","AKola");
        System.out.println(list);

        list.stream().map(n->n.startsWith("A")).forEach(System.out::println);
    }
}
