package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//16. **Remove the first element from a list using streams.**
public class eg16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(56);
        list.add(24);
        list.add(96);
        list.add(122);
        list.add(89);

        System.out.println(list);

//        System.out.println(list.stream().skip(1));                  //prints hashcode??
        list.stream().skip(1).forEach(System.out::println);
    }
}
