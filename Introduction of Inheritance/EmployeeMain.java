class Employee {
    String name; int id; double salary;
    void displayDetails() { System.out.println(name+" "+id+" "+salary); }
}
class Manager extends Employee {
    int teamSize;
    void displayDetails() { System.out.println("Manager "+name+" "+teamSize); }
}
class Developer extends Employee {
    String programmingLanguage;
    void displayDetails() { System.out.println("Developer "+name+" "+programmingLanguage); }
}
class Intern extends Employee {
    String duration;
    void displayDetails() { System.out.println("Intern "+name+" "+duration); }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Manager(); e1.name="Ravi"; ((Manager)e1).teamSize=5; e1.displayDetails();
        Employee e2 = new Developer(); e2.name="Amit"; ((Developer)e2).programmingLanguage="Java"; e2.displayDetails();
        Employee e3 = new Intern(); e3.name="Rohit"; ((Intern)e3).duration="3 months"; e3.displayDetails();
    }
}
