import java.util.*;

public class Search{

    public void process(int[] Arr, int num){
        for(int i=0; i<Arr.length; i++){
            if(Arr[i]==num){
                System.out.println("The element " + num + "present at position " + i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        Search obj = new Search();
        System.out.println("Enter the element you want to search;");
        int ser = Obj.nextInt();
        int[] arr = {1,3,4,5,6,8,10};
        obj.process(arr,ser);
    }
}