package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//7. **Count the number of elements in a list.
public class eg7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++ ){
            list.add(i);
        }
        System.out.println(list.stream().count());
    }
}
