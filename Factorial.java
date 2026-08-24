import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number to get Factorial:-");
        int num = inp.nextInt(), count = 1;
        for(int i = num; i>0; i--) {
            count = count*i;
        }
        System.out.println("Factorial:- " + count);
    }
}
