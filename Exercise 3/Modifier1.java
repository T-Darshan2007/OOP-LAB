class Modifier1 {

    public int a = 10;     // public
    private int b = 20;    // private
    int c = 30;            // default

    void display() {
        System.out.println("Public a: " + a);
        System.out.println("Private b: " + b);
        System.out.println("Default c: " + c);
    }

    public static void main(String[] args) {
        Modifier1 obj = new Modifier1();
        obj.display();
    }
}