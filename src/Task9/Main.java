package Task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L,
                "Ali",
                List.of(
                        new OrderItem("Laptop", 1200, 1),
                        new OrderItem("Mouse", 50, 2)
                )));
        orders.add(new Order(2L,
                "Murad",
                List.of(
                        new OrderItem("Phone", 800, 2),
                        new OrderItem("Mouse", 50, 3)
                )));
        orders.add(new Order(3L,
                "Ali",
                List.of(
                        new OrderItem("Laptop", 1200, 1),
                        new OrderItem("Keyboard", 150, 2)
                )));


        double total = orders
                .stream()
                .flatMap(order -> order.getItems()
                        .stream())
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
        System.out.println("Umumi satis meblegi: " + total);


        Map<String, Integer> products = orders
                .stream()
                .flatMap(order -> order.getItems().stream())
                .collect(Collectors.groupingBy(OrderItem::getProductName
                        , Collectors.summingInt(OrderItem::getQuantity)));

      Map.Entry<String,Integer>mostSold =  products.entrySet().stream()
                .max(Map.Entry.comparingByValue())
              .get() ;

      System.out.println("En cox satilan mehsul: " + mostSold.getKey()+ " - "+ mostSold.getValue() + " eded" );

      Map<String,Double> total1 = orders
              .stream()
              .collect(Collectors.groupingBy(Order::getCustomer,Collectors.summingDouble(order -> order.getItems()
                      .stream()
                      .mapToDouble(item -> item.getPrice() * item.getQuantity())
                      .sum()))) ;
      total1.forEach((customer ,total3 ) -> System.out.println(customer +"- toplam xerc: " +total3)) ;


     List<String> productsOver =  orders
              .stream()
              .flatMap(order -> order.getItems().stream())
              .filter(orderItem -> orderItem.getPrice()>100)
              .map(OrderItem::getProductName)
             .distinct()
              .toList() ;

     System.out.println("100 AZN den yuxari mehsullar : "+ productsOver);



    }
}
