import java.io.*;

class FileHandler {
    FileHandler() throws IOException {
        throw new IOException("File missing");
    }
}

public class Main16 {
    public static void main(String[] args){
        try {
            FileHandler f = new FileHandler();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
