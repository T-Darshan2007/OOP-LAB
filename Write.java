import java.io.*;

public class Write{
    public static void main(String[] args) {
        try {
            FileWriter op = new FileWriter("mytext.txt");
            op.write("Files in Java might be tricky, but it is fun enough!");
            op.close();
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}