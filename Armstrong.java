import java.util.Scanner;


public class Armstrong {
    int count(int n) {
        int ret = 0;
        while(n>0) {
            n=n/10;
            ret++;
        }
        return ret;
    }

    void arm(int num) {
        int pow = count(num);
        int dgit = 0;
        int temp = num;
        while(num>0) {
            dgit = dgit + (int)Math.pow(num%10, pow);
            num = num/10;
        }
        if(dgit == temp) {
            System.out.print(dgit + " ");
        }
        
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Armstrong obj = new Armstrong();
        int value1 = inp.nextInt(), value2 = inp.nextInt();
        for(int i = value1; i < value2; i++) {
            obj.arm(i);
        }
    }
}
