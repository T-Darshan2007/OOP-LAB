import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Rupee to convert USD:-");
        double rup = inp.nextDouble();
        System.out.println("USD = $" + rup/95.68);
    }
}
