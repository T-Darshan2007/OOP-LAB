import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Calculator:-");
        System.out.println("Enter two numbers and an operand(+,-,*,/)");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        char o = inp.next().charAt(0);
        if(o == '+') {
            System.out.println(a+b);
        }
        else if(o == '-') {
            System.out.println(a-b);
        }
        else if(o == '*') {
            System.out.println(a*b);
        }
        else if(o == '/') {
            if(b!=0){
                System.out.println(a/b);
            }
            else {
                System.out.println("Division by Zero Not possible");
            }
        }
    }
}
