package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//33. **Filter out negative numbers from a list of integers.**
public class eg33 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for(int i = -10; i <= 10; i++ ){
            list.add(i);
        }
        System.out.println(list);

        List<Integer> noNegative = list.stream().filter(n->n>=0).toList();
        System.out.println(noNegative);
    }
}
