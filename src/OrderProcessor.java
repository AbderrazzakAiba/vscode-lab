import java.util.List;

public class OrderProcessor {

    public void printOrderSummary(Order order) {
        // Calculate total price
        double totalPrice = calculateTotalPrice(order.getItems());

        // Apply discount
        totalPrice = applyDiscount(totalPrice, order.getCustomer().isPremium());

        // Print summary
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + (item.getQuantity() * item.getPrice()));
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }

    // 🔹 Extracted method 1
    private double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    // 🔹 Extracted method 2
    private double applyDiscount(double totalPrice, boolean isMember) {
        if (isMember) {
            return totalPrice * 0.9;
        }
        return totalPrice;
    }
}