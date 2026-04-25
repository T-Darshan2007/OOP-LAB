import java.io.*;

public class Append{
    public static void main(String[] args) {
        try (FileWriter op = new FileWriter("mytext.txt", true)){
            op.write("Files in Java might be tricky");
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}