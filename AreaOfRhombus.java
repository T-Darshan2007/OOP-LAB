import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two diagonals(metres) of Rhombus to calculate it's area:-");
        double d1 = obj.nextDouble(), d2 = obj.nextDouble();
        System.out.println("Area = " + (d1*d2)/2 + "m^2");
    }
}
