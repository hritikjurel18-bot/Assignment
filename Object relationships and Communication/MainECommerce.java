import java.util.*;

class Product {
    private String name;
    private double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    String getName() {
        return name;
    }
    double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();
    Order(int orderId) {
        this.orderId = orderId;
    }
    void addProduct(Product p) {
        products.add(p);
    }
    double getTotalAmount() {
        double total = 0;
        for (Product p : products) total += p.getPrice();
        return total;
    }
    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) System.out.println(" - " + p.getName() + ": " + p.getPrice());
        System.out.println("Total: " + getTotalAmount());
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        orders.add(o);
    }
    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) o.showOrderDetails();
    }
}

public class MainECommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Keyboard", 1500);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        Customer c1 = new Customer("Vineet");
        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showOrders();
    }
}
