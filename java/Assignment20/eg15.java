package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//15. **Calculate the product of all integers in a list.**
public class eg15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(56);
//        list.add(12);
//        list.add(56);
//        list.add(12);
//        list.add(89);

        for (int i = 1; i <= 5; i++ ){
            list.add(i);
        }

        System.out.println(list);

        int x=list.stream().reduce(1,(n1,n2)->n1*n2);
        System.out.println(x);
//       System.out.println(list.stream().reduce(1,(a,b)->a*b));
    }
}
