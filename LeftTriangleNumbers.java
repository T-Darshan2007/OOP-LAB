import java.util.Scanner;

public class LeftTriangleNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(); // Total number of rows to print

        // Outer loop handles the rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop 1: Prints decreasing leading spaces 
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop 2: Prints increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            // Moves cursor to the next line after completing a row
            System.out.println();
        }
    }
}
