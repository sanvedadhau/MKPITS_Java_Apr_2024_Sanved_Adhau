package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//
public class eg8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++ ){
            list.add(i);
        }

        int sum = list.stream().mapToInt(n -> n).sum();

        long count = list.stream().count();
//        System.out.println(list.stream().map(n->sum/count));
        System.out.println(sum/count);
    }
}
