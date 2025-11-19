class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String m){ super(m); }
}

public class Main3 {
    static void validate(String u, String p) throws InvalidCredentialsException {
        if(!u.equals("admin") || !p.equals("123")) throw new InvalidCredentialsException("Invalid login");
    }
    public static void main(String[] args){
        try {
            validate("abc","000");
        } catch(InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }
    }
}
