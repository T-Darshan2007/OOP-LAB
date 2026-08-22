import java.util.Scanner;

public class AreaOfIsoTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("To calculate the area of isosceles triangle enter radius in meters:-");
        double h = obj.nextDouble(), b = obj.nextDouble();
        System.out.println("Area = " + (h*b)/2 + "m^2");
    }
}
