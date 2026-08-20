import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.next();
        System.out.println("Welcome to the World of Java, " + name);
    }
}
