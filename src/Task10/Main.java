package Task10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ali", 2000),
                new Employee("Ali", 3000),
                new Employee("Murad", 2500),
                new Employee("Nigar", 4000),
                new Employee("Samir", 3500),
                new Employee("Elvin", 1200)
        );

        List<String> list = employees
                .stream()
                .filter(employee -> employee.getSalary() >= 1500)
                .collect(Collectors.toMap(Employee::getName,
                        e -> e,
                        (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2))
                .values()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(employee -> employee.getName() +" maas: " +employee.getSalary())
                .toList();

        list.forEach(System.out::println);


    }
}
