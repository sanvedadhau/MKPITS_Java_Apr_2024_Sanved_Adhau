package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//30. **Convert a list of integers to a list of their squares.**
public class eg30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10 ; i++){
            list.add(i);
        }

        List <Integer> list1 = list.stream().map(n -> n*n).toList();
        System.out.println(list1);
    }
}
