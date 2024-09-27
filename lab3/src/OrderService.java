public class OrderService {
    private void processOrder(String productName, int quantity, double price, String action) {
        double totalPrice = quantity * price;
        System.out.println("Order for " + productName + " " + action + ". Total: " + totalPrice);
    }

    public void createOrder(String productName, int quantity, double price) {
        processOrder(productName, quantity, price, "created");
    }

    public void updateOrder(String productName, int quantity, double price) {
        processOrder(productName, quantity, price, "updated");
    }
}
