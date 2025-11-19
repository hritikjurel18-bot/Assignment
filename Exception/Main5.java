import java.util.*;

class NegativeAmountException extends Exception { public NegativeAmountException(String m){ super(m); } }
class InsufficientFundsException2 extends Exception { public InsufficientFundsException2(String m){ super(m); } }
class NetworkFailureException extends Exception { public NetworkFailureException(String m){ super(m); } }

class Transaction {
    void doTransaction() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random r = new Random();
        int x = r.nextInt(3);
        if(x==0) throw new NegativeAmountException("Negative amount");
        if(x==1) throw new InsufficientFundsException2("Insufficient balance");
        throw new NetworkFailureException("Network failed");
    }
}

public class Main5 {
    public static void main(String[] args){
        Transaction t = new Transaction();
        try {
            t.doTransaction();
        } catch(NegativeAmountException e){ System.out.println(e.getMessage()); }
        catch(InsufficientFundsException2 e){ System.out.println(e.getMessage()); }
        catch(NetworkFailureException e){ System.out.println(e.getMessage()); }
    }
}
