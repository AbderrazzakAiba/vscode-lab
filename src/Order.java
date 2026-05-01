import java.util.List;

public class Order {
    private Customer customer;
    private List<Item> items;
    private double totalAmount;

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}