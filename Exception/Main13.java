class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String m){ super(m); }
}

class PaymentFailedException2 extends Exception {
    public PaymentFailedException2(String m){ super(m); }
}

public class Main13 {

    static void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("Seat unavailable");
    }

    static void processPayment() throws PaymentFailedException2 {
        throw new PaymentFailedException2("Payment failed");
    }

    static void bookTicket() throws SeatUnavailableException, PaymentFailedException2 {
        checkSeatAvailability();
        processPayment();
    }

    public static void main(String[] args){
        try {
            bookTicket();
        }
        catch(SeatUnavailableException e){
            System.out.println(e.getMessage());
        }
        catch(PaymentFailedException2 e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
