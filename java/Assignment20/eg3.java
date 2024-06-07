package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//3. **Find the sum of all numbers in a list.
public class eg3 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for (int i = 1; i < 50; i++){
            list.add(i);
        }
        System.out.println(list);

        int sum = list.stream().mapToInt(n -> n).sum();
        System.out.println(sum);

//        int product = list.stream().reduce(1,(n,m)->n*m);
//        System.out.println(product);
    }
}
