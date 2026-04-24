import java.util.*;

public class Array{
    public static void main(String[] args) {
        int[] arr = {30,50,20,10,40};
        System.out.println(arr[3]);
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}