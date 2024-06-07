package StreamDemo.Assignment20;

import java.util.ArrayList;
import java.util.List;

//2. **Find the maximum number in a list of integers.
public class eg2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            numbers.add(i);
        }

//        System.out.println("Numbers: " + numbers);

        int maxNumber = numbers.stream().max(Integer::compareTo).get();

        System.out.println("Maximum Number: " + maxNumber);
    }
}
