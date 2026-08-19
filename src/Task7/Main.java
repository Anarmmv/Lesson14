package Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Product> products = new ArrayList<>() ;
        products.add(new Product("Laptop" , "Electronics" , 1200)) ;
        products.add(new Product("Phone" , "Electronics" , 800)) ;
        products.add(new Product("Table" , "Furniture" , 300)) ;
        products.add(new Product("Chair " , "Furniture" , 100)) ;
        products
                .stream()
                .collect(Collectors
                        .groupingBy(Product::getCategory,Collectors.summingDouble(Product::getPrice)
                        )
                )
                .entrySet()
                .forEach(System.out::println);






    }
}
