interface Worker {
    void performDuties();
}
class Person {
    String name; int id;
}
class Chef extends Person implements Worker {
    public void performDuties() { System.out.println("Cooking"); }
}
class Waiter extends Person implements Worker {
    public void performDuties() { System.out.println("Serving"); }
}
public class RestaurantMain {
    public static void main(String[] args) {
        Worker c = new Chef();
        Worker w = new Waiter();
        c.performDuties();
        w.performDuties();
    }
}
