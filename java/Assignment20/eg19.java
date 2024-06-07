package StreamDemo.Assignment20;


import java.util.ArrayList;
import java.util.List;

//19. **Check if all strings in the list are non-empty.**
public class eg19 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("anjangaon");
        list.add("akola");
        list.add("amravati");
        list.add("");
        list.add("pune");
        list.add("nagpur");

        list.stream().map(n->n.isEmpty()).forEach(System.out::println);
        System.out.println("-------");
        System.out.println(list.stream().allMatch(n -> !n.isEmpty()));



    }
}
