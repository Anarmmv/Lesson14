package Task8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ali", "IT", 2500));
        employees.add(new Employee("Murad", "IT", 3200));
        employees.add(new Employee("Nigar", "HR", 2300));
        employees.add(new Employee("Leyla", "HR", 2800));
        employees.add(new Employee("Samir", "Sales", 3000));

     Map<String, Optional<Employee>> result =  employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparing(Employee::getSalary))));
        result.forEach((department, employee) ->
                System.out.println(department + " -> " + employee.get().getName())) ;



    }

}