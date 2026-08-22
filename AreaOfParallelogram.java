import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("To calculate the area of parallelogram enter height and base in meters:-");
        double hei = obj.nextDouble(), bas = obj.nextDouble();
        System.out.println("Area = " + hei*bas + "m^2");
    }
}
