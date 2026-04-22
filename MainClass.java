import java.util.*;

public class MainClass{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("To check whether a number is divisible by 3 or 5 or both, enter the number:-");
        int num1 = op.nextInt();
        if (num1%3==0 && num1%5==0){
            System.out.println("FizzBuzz");
        }

        else if (num1%3==0){
            System.out.println("Fizz");
        }

        else if (num1%5==0){
            System.out.println("Buzz");
        }
    }
}