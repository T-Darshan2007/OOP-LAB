import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        String rev = new StringBuilder(str).reverse().toString();
        if(rev.equals(str)) {
            System.out.println("It is palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
