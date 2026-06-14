import java.util.*;

public class Bub{
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        System.out.println("Unsorted Array "  + Arrays.toString(arr));
        int len = arr.length;

        for(int i=0; i<len; i++){
            for(int j=0; j<(len-i-1); j++){
                if(arr[j]>arr[j+1]){
                    int var = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = var;
                }
            }
        }

        System.out.println("Sorted Array " + Arrays.toString(arr));
    }
}