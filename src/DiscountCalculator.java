public class DiscountCalculator {

    public double calculateDiscount(Order order) {
        double discount = 0.0;
        if (order.getTotalAmount() > 100) {
            if (order.getCustomer().isPremium()) {
                discount = 0.2; // 20% discount
            } else {
                discount = 0.1; // 10% discount
            }
        }
        return discount;
    }
}