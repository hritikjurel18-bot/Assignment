class Book {
    String title; int publicationYear;
    void displayInfo() { System.out.println(title+" "+publicationYear); }
}
class Author extends Book {
    String name; String bio;
    void displayInfo() { System.out.println(title+" "+publicationYear+" "+name+" "+bio); }
}
public class LibraryMain {
    public static void main(String[] args) {
        Author a = new Author();
        a.title="Java Basics";
        a.publicationYear=2020;
        a.name="James Gosling";
        a.bio="Creator of Java";
        a.displayInfo();
    }
}
