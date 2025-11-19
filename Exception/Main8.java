class InvalidTemperatureException extends Exception { public InvalidTemperatureException(String m){ super(m); } }

public class Main8 {
    static void convert(double temp, char unit) throws InvalidTemperatureException {
        if(unit=='C' && temp < -273.15) throw new InvalidTemperatureException("Temperature below absolute zero");
        if(unit=='F' && temp < -459.67) throw new InvalidTemperatureException("Temperature below absolute zero");
        if(unit=='C') System.out.println((temp*9/5)+32);
        else System.out.println((temp-32)*5/9);
    }
    public static void main(String[] args){
        try { convert(-300,'C'); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
