class Order {
    int orderId; String orderDate;
    String getOrderStatus() { return "Ordered"; }
}
class ShippedOrder extends Order {
    String trackingNumber;
    String getOrderStatus() { return "Shipped"; }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    String getOrderStatus() { return "Delivered"; }
}
public class OrderMain {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 1;
        d.orderDate = "28-Oct-2025";
        d.trackingNumber = "TR12345";
        d.deliveryDate = "30-Oct-2025";
        System.out.println(d.getOrderStatus());
    }
}
