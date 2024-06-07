package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//24. **Limit the list to the first 3 elements.**
public class eg24 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10 ; i++){
            list.add(i);
        }
        System.out.println("Original List : " + list);

        List<Integer> limitedList = list.stream().limit(3).toList();
        System.out.println("Limited list : "+limitedList);

    }
}
