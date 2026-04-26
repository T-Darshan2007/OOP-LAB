import java.io.*;

public class Create{
    public static void main(String[] args) {
        try {
           File op = new File("mytext.txt");
           if (op.createNewFile()) {
               System.out.println("File Created:" + op.getName());
           } else {
            System.out.println("File Already Exists");
           } 
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}