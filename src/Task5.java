import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 2, 6);

         numbers
                 .stream()
                 .collect(Collectors.groupingBy(
                         Function.identity(),
                         Collectors.counting()
                 ))
                 .entrySet()
                 .stream()
                 .filter(num->num.getValue()>=2)
                 .forEach(System.out::println);


    }
}