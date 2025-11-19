import java.util.*;

class Doctor {
    private String name;
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println(name + " consulted " + p.getName());
    }
}

class Patient {
    private String name;
    Patient(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    Hospital(String name) {
        this.name = name;
    }
    void addDoctor(Doctor d) {
        doctors.add(d);
    }
    void addPatient(Patient p) {
        patients.add(p);
    }
    void showHospital() {
        System.out.println("Hospital: " + name);
        for (Doctor d : doctors) System.out.println("Doctor: " + d);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo");
        Doctor d1 = new Doctor("Dr. Mehta");
        Doctor d2 = new Doctor("Dr. Roy");
        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Sita");
        h.addDoctor(d1);
        h.addPatient(p1);
        d1.consult(p1);
        d2.consult(p2);
    }
}
