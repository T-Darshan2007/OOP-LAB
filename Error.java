public class Error{
    public static void main(String[] args) {
        int num1 = 0;
        try {
            if (num1>0){
                System.out.println("+ve");
            }
            else if (num1<0){
                System.out.println("-ve");
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Over");
        }
    }
}