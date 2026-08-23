import java.util.Scanner;

public class AreaOfEquTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("To calculate the area of equalatrial triangle enter side in meters:-");
        double h = obj.nextDouble();
        System.out.println("Area = " + (Math.sqrt(3)*Math.pow(h,2))/4+ "m^2");
    }
}
