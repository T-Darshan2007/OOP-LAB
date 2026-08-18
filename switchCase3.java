import java.util.Scanner;

public class switchCase3 {

        void disp() {
            System.out.println("Welcome to the Java world");
        }
        void dis() {
            System.out.println("Hello;");
        }
    public static void main(String[] args) {
        switchCase3 obj = new switchCase3();
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        switch (num) {
            case 1:
                obj.disp();
                break;
            case 2:
                obj.dis();
                break;
            default:
                System.out.println("Enter a valid one;");
        }
        
    }
}
