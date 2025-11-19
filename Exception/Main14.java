class AccountNotFoundException extends Exception { public AccountNotFoundException(String m){ super(m); } }
class InsufficientFundsException3 extends Exception { public InsufficientFundsException3(String m){ super(m); } }

public class Main14 {
    static void verifyAccount() throws AccountNotFoundException { throw new AccountNotFoundException("Account not found"); }
    static void processTransaction() throws InsufficientFundsException3 { throw new InsufficientFundsException3("Insufficient funds"); }

    static void executeTransaction() throws Exception {
        verifyAccount();
        processTransaction();
    }

    public static void main(String[] args){
        try { executeTransaction(); }
        catch(Exception e){ System.out.println(e.getMessage()); }
        finally { System.out.println("Transaction complete."); }
    }
}
