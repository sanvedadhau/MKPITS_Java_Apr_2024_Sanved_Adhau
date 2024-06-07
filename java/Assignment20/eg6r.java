package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//6. **Get a list of unique numbers from a list with duplicates.
public class eg6r {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i <= 50; i++ ){
            list.add(i);
        }

        List <Integer> list1 = new ArrayList<>();
        for (int i = 20; i <= 50; i++ ){
            list1.add(i);
        }

        List<List<Integer>> list2 = new ArrayList<>();
//        list

        list.stream().distinct().toList();
    }
}



