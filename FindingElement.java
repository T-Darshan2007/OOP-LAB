public class FindingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int poin1 = 0, poin2 = arr.length-1, target = 90;
        while (true) { 
            if(arr[poin1]==target) {
                System.out.println("Found at " + poin1);
                break;
            }
            else if(arr[poin2]==target) {
                System.out.println("Found at " + poin2);
                break;
            }
            else if(poin1 == poin2) {
                System.out.println("Not found");
                break;
            }
            else {
                poin1+=1;
                poin2-=1;
            }
        }
    }
}
