import java.util.Arrays;

public class PracticeJava01 {
    public static void main(String[] args) {
        int[] arr = {10,23,45,67,78,88};
        System.out.println("Arr = " + Arrays.toString(arr));
        funs(arr);
        System.out.println("Arr = "+Arrays.toString(arr));
    }

    static void funs(int[] nums){
        nums[0] = 90;
        System.out.println("Nums = "+Arrays.toString(nums));
    }
}
