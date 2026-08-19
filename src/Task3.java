import java.util.List;

public class Task3 {
    static void main(String[] args) {


        List<Integer> numbers = List.of(2, 7, 4, 10, 3, 8);
       int total =  numbers.stream()
                .filter(n-> n>5)
                .mapToInt(n->n.intValue())
                .sum() ;
       System.out.println(total);

    }


}
