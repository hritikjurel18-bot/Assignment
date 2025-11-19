class Person {
    String name; int age;
}
class Teacher extends Person {
    String subject;
    void displayRole() { System.out.println("Teacher"); }
}
class Student extends Person {
    int grade;
    void displayRole() { System.out.println("Student"); }
}
class Staff extends Person {
    String department;
    void displayRole() { System.out.println("Staff"); }
}
public class SchoolMain {
    public static void main(String[] args) {
        new Teacher().displayRole();
        new Student().displayRole();
        new Staff().displayRole();
    }
}
