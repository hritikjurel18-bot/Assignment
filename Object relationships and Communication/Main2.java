class Bank {
    private String name;
    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer c) {
        System.out.println(c.getName() + " opened an account in " + name);
    }
}

class Customer {
    private String name;
    private double balance;
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    String getName() {
        return name;
    }
    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        Customer c1 = new Customer("Rohan", 5000);
        bank.openAccount(c1);
        c1.viewBalance();
    }
}
