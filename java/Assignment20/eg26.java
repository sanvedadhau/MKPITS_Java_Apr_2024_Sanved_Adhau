package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//26. **Remove null elements from a list.**
public class eg26 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.add(2, null);
        list.add(6, null);
        System.out.println(list);

        List <Integer> noNull= list.stream().filter(n->n!= null).toList();
//        .filter(Objects::nonNull)
        System.out.println(noNull);
    }
}
