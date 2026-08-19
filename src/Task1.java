import java.util.List;

public class Task1 {
    static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 8);
     List<Integer>even =   numbers.stream()
                .filter(n-> n % 2 == 0  )
                        .toList();
     System.out.println(even);
    }
}