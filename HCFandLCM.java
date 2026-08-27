import java.util.Scanner;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int hcf = x;
        int lcm = (a == 0 || b == 0) ? 0 : (a / hcf) * b;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
