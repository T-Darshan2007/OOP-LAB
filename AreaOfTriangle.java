import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        System.out.println("To calculate the area of triangle enter height and base in meters:-");
        double heg = obj.nextDouble(),bas = obj.nextDouble();
        System.out.println("Area = " + (heg*bas)/2 + "m^2"); 
    }
}