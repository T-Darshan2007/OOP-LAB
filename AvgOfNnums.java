import java.util.Scanner;

public class AvgOfNnums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("To calculate the Average of N nums until enter Zero:-");
        int num, count = 0,sum=0;
        do { 
            num = inp.nextInt();
            if(num!=0){
                count+=1;
                sum+=num;
            }
        } while (num!=0);
        System.out.println("Average = " + sum/count);
    }
}
