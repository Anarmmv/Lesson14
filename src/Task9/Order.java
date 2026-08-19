package Task9;

import java.util.List;

public class Order {
    private Long id;
    private String customer;
    private List<OrderItem> items;

    public Order(Long id, String customer, List<OrderItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
