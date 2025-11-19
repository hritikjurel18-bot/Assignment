class BankAccount {
    int accountNumber; double balance;
}
class SavingsAccount extends BankAccount {
    double interestRate;
    void displayAccountType() { System.out.println("Savings Account"); }
}
class CheckingAccount extends BankAccount {
    int withdrawalLimit;
    void displayAccountType() { System.out.println("Checking Account"); }
}
class FixedDepositAccount extends BankAccount {
    int term;
    void displayAccountType() { System.out.println("Fixed Deposit Account"); }
}
public class BankMain {
    public static void main(String[] args) {
        new SavingsAccount().displayAccountType();
        new CheckingAccount().displayAccountType();
        new FixedDepositAccount().displayAccountType();
    }
}
