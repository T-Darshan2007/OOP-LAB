public class ArraysMedianElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int poin1=0,poin2=0;
        while (true) { 
            if(poin1 == arr.length-1) {
                System.out.println(arr[poin2]);
                break;
            }
            else {
                poin1+=2;
                poin2+=1;
            }
        }
    }
}
