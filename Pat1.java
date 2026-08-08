import java.util.Scanner;

public class Pat1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}