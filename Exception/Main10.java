import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String m){ super(m); } }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String m){ super(m); } }

public class Main10 {
    static Map<Integer,Boolean> seats = new HashMap<>();
    static {
        for(int i=1;i<=5;i++) seats.put(i,true);
    }
    static void book(int n) throws Exception {
        if(!seats.containsKey(n)) throw new InvalidSeatException("Seat does not exist");
        if(!seats.get(n)) throw new SeatAlreadyBookedException("Seat already booked");
        seats.put(n,false);
    }

    public static void main(String[] args){
        try { book(2); book(2); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
