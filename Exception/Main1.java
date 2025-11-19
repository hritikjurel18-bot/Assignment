class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String m){ super(m); }
}

class ATM {
    int balance = 10000;
    void withdraw(int amount) throws InsufficientFundsException {
        if(amount > balance) throw new InsufficientFundsException("Not enough balance");
        balance -= amount;
    }
}

public class Main1 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
