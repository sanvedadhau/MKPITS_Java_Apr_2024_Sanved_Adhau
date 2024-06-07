package StreamDemo.Assignment20;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//35. **Get a list of unique characters from a list of strings.**
public class eg35r {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amravati","n@gpur","pune","AKola","$ikkim","@","157");

        List <Character> uniqueChars = list.stream().flatMapToInt(String::chars).filter(n -> (n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z')).mapToObj(c -> (char) c).collect(Collectors.toList());

        System.out.println(uniqueChars);

    }
}
