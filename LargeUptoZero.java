import java.util.Scanner;

public class LargeUptoZero {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num, count=-999;
        do { 
            num = inp.nextInt();
            if(num>count) {
                count = num;
            }
        } while (num!=0);
    System.out.println("The largest: "+count);
    }
}
