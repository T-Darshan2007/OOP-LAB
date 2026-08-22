import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("To calculate the area of rectangle enter length and breath in meters:-");
        double len = obj.nextDouble(), bre = obj.nextDouble();
        System.out.println("Area = " + len*bre + "m^2");
    }
}
