import java.util.Scanner;

public class LargeOfTwoNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        if(num1>num2) {
            System.out.println("Larger number is " + num1);
        }
        else if(num1<num2) {
            System.out.println("Larger number is " + num2);
        }
        else {
            System.out.println("Both the number are same");
        }
    }
}
