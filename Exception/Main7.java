import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){ super(m); } }
class InvalidReturnException extends Exception { public InvalidReturnException(String m){ super(m); } }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){ super(m); } }

public class Main7 {
    static Map<String,Boolean> books = new HashMap<>();
    static Map<String,Integer> userBooks = new HashMap<>();

    static {
        books.put("Java", true);
        books.put("Python", false);
        userBooks.put("Aman", 5);
    }

    static void borrow(String user, String book) throws Exception {
        if(!books.get(book)) throw new BookNotAvailableException("Book not available");
        if(userBooks.getOrDefault(user,0) >= 5) throw new UserLimitExceededException("Limit exceeded");
        books.put(book, false);
    }

    static void returnBook(String user, String book) throws Exception {
        if(books.get(book)) throw new InvalidReturnException("Invalid return");
        books.put(book,true);
    }

    public static void main(String[] args){
        try {
            borrow("Aman","Java");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
