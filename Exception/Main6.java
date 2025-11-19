class ServiceOverdueException extends Exception { public ServiceOverdueException(String m){ super(m); } }
class InvalidMileageException extends Exception { public InvalidMileageException(String m){ super(m); } }

class Vehicle {
    void checkMaintenance(int days, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if(days > 30) throw new ServiceOverdueException("Service overdue");
        if(mileage < 0) throw new InvalidMileageException("Invalid mileage");
    }
}

public class Main6 {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        try {
            v.checkMaintenance(40,-10);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
