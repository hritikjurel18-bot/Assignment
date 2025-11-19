public class Main15 {
    static void methodB(){
        try {
            Integer.parseInt("abc");
        } catch(NumberFormatException e){
            System.out.println("Number format error");
        }
        String x = null;
        x.length();
    }
    static void methodA(){
        methodB();
    }
    public static void main(String[] args){
        try { methodA(); }
        catch(Exception e){ System.out.println("Caught in A: " + e); }
    }
}
