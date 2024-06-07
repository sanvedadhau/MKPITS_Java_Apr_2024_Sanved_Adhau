package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//14. **Partition a list of integers into even and odd.**
public class eg14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++ ){
            list.add(i);
        }
        System.out.println(list.stream().collect(Collectors.groupingBy(n->n%2==0)));
//        System.out.println(list.stream().collect(Collectors.partitioningBy(n->n%2==0)));
    }
}
