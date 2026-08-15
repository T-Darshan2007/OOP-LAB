public class SwitchCase {
    public static void main(String[] args) {
        int age = 12;
        switch(age) {
            case 18:
                System.out.println("Eligible for vote");
                break;
            case 17:
                System.out.println("Not Eligible for vote");
                break;
            default:
                System.out.println("Enter proper age");
                break;
        }
    }
}
