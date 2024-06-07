package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//25. **Skip the first 2 elements in a list.**
public class eg25 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Original List : "+list);

        List <Integer> skippedList  = list.stream().skip(2).toList();
        System.out.println(skippedList);

    }
}
