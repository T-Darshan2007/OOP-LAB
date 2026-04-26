public class Error1{
    public static void main(String[] args) {
        int num1 = 0;
        try {
            System.out.println(5/num1);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Over");
        }
    }
}