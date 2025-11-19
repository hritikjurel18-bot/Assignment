import java.util.*;

class Faculty {
    private String name;
    Faculty(String name) {
        this.name = name;
    }
    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    private String deptName;
    DepartmentU(String deptName) {
        this.deptName = deptName;
    }
    void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    private String name;
    private List<DepartmentU> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    University(String name) {
        this.name = name;
    }
    void addDepartment(DepartmentU d) {
        departments.add(d);
    }
    void addFaculty(Faculty f) {
        faculties.add(f);
    }
    void showUniversity() {
        System.out.println("University: " + name);
        for (DepartmentU d : departments) d.showDepartment();
        for (Faculty f : faculties) f.showFaculty();
    }
}

public class Main5 {
    public static void main(String[] args) {
        University uni = new University("Delhi University");
        DepartmentU d1 = new DepartmentU("CSE");
        DepartmentU d2 = new DepartmentU("Mechanical");
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Ritu");
        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.showUniversity();
    }
}
