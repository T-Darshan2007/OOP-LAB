import java.util.Scanner;

public class Fibonnaci {
   public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt(), First=0, second=1;
    for(int i=1; i<=n; i++) {
        System.out.print(First+" ");
        int num = First+second;
        First = second;
        second = num;
    }
   } 
}
