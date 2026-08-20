import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a integer number:-");
        int num = inp.nextInt();
        if(num%2==0) {
            System.out.println("Even number;");
        }
        else {
            System.out.println("Odd number;");
        }
    }
}
