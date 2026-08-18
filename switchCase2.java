import java.util.Scanner;

public class switchCase2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int empno = inp.nextInt();
        String dept = inp.next();

        switch (empno) {
            case 1:
                System.out.println("Ajith");
                break;
            case 2:
                System.out.println("Vijay");
                break;
            case 3:
                switch (dept) {
                    case "Developer":
                        System.out.println("Developer Department");
                        break;
                    case "Service":
                        System.out.println("Service Department");
                        break;
                    case "Marketing":
                        System.out.println("Marketing Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter a valid dept;");
                }
                break;
            default:
                System.out.println("Enter a valid empno;");
        }
    }
}
