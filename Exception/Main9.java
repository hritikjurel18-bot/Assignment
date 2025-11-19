import java.time.*;

class LateSubmissionException extends Exception { public LateSubmissionException(String m){ super(m); } }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String m){ super(m); } }

public class Main9 {
    static LocalDateTime deadline = LocalDateTime.of(2025,1,10,23,59);
    static void submitExam(String file, LocalDateTime time) throws Exception {
        if(!file.endsWith(".pdf")) throw new InvalidFileFormatException("Invalid file format");
        if(time.isAfter(deadline)) throw new LateSubmissionException("Late submission");
    }
    public static void main(String[] args){
        try {
            submitExam("abc.docx", LocalDateTime.now());
        } catch(Exception e){
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
}
