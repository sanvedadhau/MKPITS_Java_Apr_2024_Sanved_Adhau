package StreamDemo.Assignment19;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//1. Filtering and Collecting:
//Create a numbers of strings and use a stream to filter out strings that start with the letter "A".
// Collect the filtered strings into a new numbers.
public class eg1 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Akola");
        list.add("nagpur");
        list.add("amravati");
        list.add("gondia");


////        using lambda function
//        numbers.stream().map(n->n.toUpperCase()).filter(n->n.startsWith("A"));
//
////        using method reference
//        numbers.stream().map(String::toUpperCase).filter(n->n.startsWith("A"));



        List<String> filteredStrings = list.stream().map(n->n.toUpperCase()).filter(s -> s.startsWith("A")).collect(Collectors.toList());


        filteredStrings.forEach(System.out::println);

    }
}
