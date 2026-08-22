import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("To calculate the area of circle enter radius in meters:-");
        double rad = obj.nextDouble();
        double res = Math.PI*Math.pow(rad,2);
        System.out.println("Area = " + res + "m^2");
    }
}
