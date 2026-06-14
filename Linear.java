import java.util.*;

public class Linear{
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the element you want to search;");
        int ser = Obj.nextInt();
        int[] arr = {1,3,4,5,6,8,10};

        for(int i=0; i<arr.length; i++){
            if(arr[i]==ser){
                System.out.println("The element " + ser + "present at position " + i);
            }
        }
    }
}