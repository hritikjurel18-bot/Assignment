import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    Course(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void enroll(Student s) {
        students.add(s);
    }
    void showEnrolled() {
        System.out.println("Course: " + name);
        for (Student s : students) System.out.println(" - " + s.getName());
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void addCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }
    void showCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) System.out.println(" - " + c.getName());
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    School(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        students.add(s);
    }
    void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) System.out.println(" - " + s.getName());
    }
}

public class Main4 {
    public static void main(String[] args) {
        School school = new School("DPS");
        Student s1 = new Student("Riya");
        Student s2 = new Student("Karan");
        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);
        school.addStudent(s1);
        school.addStudent(s2);
        school.showStudents();
        s1.showCourses();
        c1.showEnrolled();
    }
}
