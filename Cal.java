import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(b != 0 ? a / b : "Cannot divide by zero"); break;
            default: System.out.println("Invalid operator");
        }
    }
}