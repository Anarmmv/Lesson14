import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task4 {
    static void main(String[] args) {
            List<String> names  =  List.of("Ali", "Muhammad", "Nigar", "Alexander") ;
         Optional< String> longest = names.stream()
                    .max(Comparator.comparingInt(n->n.length())) ;

        System.out.println(longest.orElse("Siyahı boşdur"));




    }
}

