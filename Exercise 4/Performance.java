import java.util.*;

public class Performance {
    public static void main(String[] Args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your total mark out of 100:");
        float mark = obj.nextFloat();
        String a = "";

        if (mark <= 100 && mark >= 90) {
            a = "Excellent";
        } else if (mark < 90 && mark >= 80) {
            a = "Very Good";
        } else if (mark < 80 && mark >= 70) {
            a = "Good";
        } else if (mark < 70 && mark >= 60) {
            a = "Ok";
        } else if (mark < 60 && mark >= 0) {
            a = "Very Poor";
        } else {
            System.out.println("Please enter a valid mark.");
            obj.close();
            return; // Exit early to avoid printing undefined performance
        }

        System.out.println("Performance: " + a);
        obj.close();
    }
}