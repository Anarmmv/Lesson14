package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Main {
    static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anar", 21, 89));
        students.add(new Student("Adem", 13, 71));
        students.add(new Student("Akif", 18, 70));
        students.add(new Student("Ali", 12,90 ));

       List<String> filtered = students.stream()
                .filter(s -> s.getAge() >= 18 )
                .filter( s-> s.getGrade() > 70 )
               .map(student -> student.getName())
               .sorted()
               .toList() ;
       System.out.println(filtered);






    }
}