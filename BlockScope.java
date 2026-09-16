public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = "+a);
        a=30;
        System.out.println("a = "+a);
        {
            a=50;
            int c = 80;
        }
        System.out.println("a = "+a);
        
    }
}
