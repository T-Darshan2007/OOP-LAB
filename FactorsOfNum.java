import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.print("The Factors are :- ");
        for(int i=1; i<num; i++) {
            if(num%i==0) {
                System.out.print(i + " ");
            }
        }
    }
}
