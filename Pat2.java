import java.util.Scanner;

public class Pat2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}