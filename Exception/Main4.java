import java.util.*;

class OutOfStockException extends Exception { public OutOfStockException(String m){ super(m); } }
class PaymentFailedException extends Exception { public PaymentFailedException(String m){ super(m); } }

public class Main4 {
    static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int x = r.nextInt(2);
        if(x==0) throw new OutOfStockException("Out of stock");
        else throw new PaymentFailedException("Payment failed");
    }
    public static void main(String[] args){
        try {
            placeOrder();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
