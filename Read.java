import java.io.*;
import java.util.*;

public class Read{
    public static void main(String[] args) {
        File op = new File("mytext.txt");
        try (Scanner re = new Scanner(op);){
            while (re.hasNextLine()){
                String data = re.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}