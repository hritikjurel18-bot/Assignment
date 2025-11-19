import java.io.*;

class InvalidStudentException extends Exception { public InvalidStudentException(String m){ super(m); } }

public class Main12 {
    static void validateStudent(boolean ok) throws InvalidStudentException {
        if(!ok) throw new InvalidStudentException("Invalid student");
    }
    static void submitExam() throws IOException, InvalidStudentException {
        validateStudent(false);
        throw new IOException("IO error");
    }

    public static void main(String[] args){
        try { submitExam(); }
        catch(Exception e){ System.out.println(e.getMessage()); }
        finally { System.out.println("Exam submission process completed."); }
    }
}
