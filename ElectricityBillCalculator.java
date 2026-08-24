import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = scanner.nextInt();

        double totalBill = 0.0;
        double fixedCharge = 50.00; // Standard baseline connection fee

        // Calculate bill based on progressive slab rates
        if (units <= 100) {
            totalBill = units * 1.50;
        } else if (units <= 300) {
            totalBill = (100 * 1.50) + ((units - 100) * 3.00);
        } else if (units <= 500) {
            totalBill = (100 * 1.50) + (200 * 3.00) + ((units - 300) * 5.00);
        } else {
            totalBill = (100 * 1.50) + (200 * 3.00) + (200 * 5.00) + ((units - 500) * 7.00);
        }

        // Add mandatory connection charges
        totalBill += fixedCharge;

        // Print the generated receipt
        System.out.println("\n===== ELECTRICITY BILL REVENUE =====");
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Units Consumed   : " + units + " kWh");
        System.out.println("Fixed Charges    : $" + String.format("%.2f", fixedCharge));
        System.out.println("------------------------------------");
        System.out.println("Total Amount Due : $" + String.format("%.2f", totalBill));
        System.out.println("====================================");

        // Close the scanner resource
        scanner.close();
    }
}