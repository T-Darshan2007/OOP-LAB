import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Rate, Principal, and Time to get Simple Interest");
        double r = inp.nextDouble();
        double p = inp.nextDouble();
        double t = inp.nextDouble();
        System.out.println("Simple Interest:- " + ((p*r*t)/100));
    }
}
