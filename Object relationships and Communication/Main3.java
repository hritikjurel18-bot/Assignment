import java.util.*;

class Employee {
    private String name;
    Employee(String name) {
        this.name = name;
    }
    void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();
    Department(String deptName) {
        this.deptName = deptName;
    }
    void addEmployee(Employee e) {
        employees.add(e);
    }
    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.showEmployee();
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();
    Company(String name) {
        this.name = name;
    }
    void addDepartment(Department d) {
        departments.add(d);
    }
    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.showDepartment();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department d1 = new Department("HR");
        Department d2 = new Department("IT");
        d1.addEmployee(new Employee("Aman"));
        d2.addEmployee(new Employee("Neha"));
        comp.addDepartment(d1);
        comp.addDepartment(d2);
        comp.showCompany();
    }
}
