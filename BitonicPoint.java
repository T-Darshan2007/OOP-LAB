public class BitonicPoint {
    
    int BitP(int[] arr) {
        int p1 = 0, p2 = arr.length-1, f = 0;
        while(f!=-1) {
            if(arr[p1]>arr[p1+1]) {
                f=-1;
                return arr[p1];
            }
            else if(arr[p2]>arr[p2-1]){
                f=-1;
                return arr[p2];
            }
            else {
                p1+=1;
                p2-=1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        BitonicPoint obj = new BitonicPoint();
        int[] arr = {2,4,6,8,12,7,5,1};
        System.out.println(obj.BitP(arr));
    }
}
