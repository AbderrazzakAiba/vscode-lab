import java.util.List;

public class OrderProcessor {

    public void printOrderSummary(Order order) {
        // Calculate total price
        double totalPrice = calculateTotalPrice(order.getItems());

        // Apply discount
        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9; // 10% discount for members
        }

        // Print summary
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + (item.getQuantity() * item.getPrice()));
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }

    // 🔹 Extracted method
    private double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }
}