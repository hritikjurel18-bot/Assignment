import java.util.*;

class Book {
    private String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void showBook() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();
    Library(String name) {
        this.name = name;
    }
    void addBook(Book b) {
        books.add(b);
    }
    void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.showBook();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Data Structures", "Mark");
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Town Library");
        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);
        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
