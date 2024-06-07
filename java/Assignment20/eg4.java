package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//4. **Convert a list of strings to uppercase.
public class eg4 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("xyr");
        list.add("abc");
        list.add("GHVFVui");
        list.add("pdn");

        list.stream().map(n -> n.toUpperCase()).toList().forEach(System.out::println);
    }
}
