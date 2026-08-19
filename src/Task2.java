import java.util.List;

public class Task2 {
    static void main(String[] args) {
        List<String> names  =  List.of("Ali", "Murad", "Nigar", "Leyla") ;
      List<String>upper =   names.stream()
              .map (String::toUpperCase)
              .toList();
      System.out.println(upper);

    }

}
