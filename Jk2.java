public class Jk2{
    int age;
    public Jk2(int age){
        this.age=age;
        boolean valid = age>=18;
        if (valid){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not ELigible");
        }
    }

    public static void main(String[] args) {
        Jk2 op = new Jk2(16);

    }
}