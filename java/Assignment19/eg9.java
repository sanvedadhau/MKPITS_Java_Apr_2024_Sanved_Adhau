package StreamDemo.Assignment19;

import java.util.ArrayList;
import java.util.List;

//9. Parallel Stream:
//Modify one of the previous assignments to use a parallel stream and compare the performance with the sequential stream.
public class eg9 {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<Integer>(){{
//            add(30);
//            add(65);
//            add(98);
//            add(19);
//            add(68);
//        }};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        System.out.println(list);

        long startTimeSequential = System.nanoTime();

        long sum =list.stream().filter(n->n%2!=0).mapToInt(n->n*2).sum();
        System.out.println(sum);

        long endTimeSequential = System.nanoTime();
        System.out.println("Sequential stream time: " + (endTimeSequential - startTimeSequential) + " nanoSec");

        long durationSequential = (endTimeSequential - startTimeSequential);
        double durationSequentialInSeconds = durationSequential / 1_000_000_000.0;
        System.out.println("Sequential stream time: " + durationSequentialInSeconds+" seconds");


        System.out.println("--------------");

        long startTimeParallel = System.nanoTime();

        long Parallelsum =list.parallelStream().filter(n->n%2!=0).mapToInt(n->n*2).sum();
        System.out.println(Parallelsum);

        long endTimeParallel = System.nanoTime();
        System.out.println("Parallel stream time: "+ (endTimeParallel-startTimeParallel)+" nanoSec");

        long durationParallel = (endTimeParallel - startTimeParallel);
        double durationParallelInSeconds = durationParallel / 1_000_000_000.0;
        System.out.println("Parallel stream time: "+ durationParallelInSeconds+" seconds");

    }
}
