import java.util.Scanner;

public class SumUptoZero {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num, count=0;
        do { 
            num = obj.nextInt();
            count+=num;
        } while (num!=0);
        System.out.println("Sum = " + count);
    }
}
