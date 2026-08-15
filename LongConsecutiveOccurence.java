import java.util.Scanner;

public class LongConsecutiveOccurence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        int count = 0, temp = -999;
        char c = ' ';
        for(int i = 0; i<str.length(); i++) {
            char at = str.charAt(i);
            for(int j = 0; j<str.length(); j++) {
                char At = str.charAt(j);
                if(at == At) {
                    count++;
                }
            }
            if(count>temp) {
                temp = count;
                count = 0;
                c = at;
            }
            else{
                count = 0;
            }
        }
        System.out.println(c + " " + temp);
    }
}
