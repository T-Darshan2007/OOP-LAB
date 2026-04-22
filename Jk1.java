public class Jk1{
    int num = 2;
    public static void main(String[] args) {
        Jk1 opp = new Jk1();
        switch (opp.num) {
            case 1:
                System.out.println("1");
                
                break;
            case 2:
                System.out.println("2");
                break;

            default:
                throw new AssertionError();
        }
    }
}