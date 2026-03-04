class Modifier2 {

    static int count = 0;

    Modifier2() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    public static void main(String[] args) {
        Modifier2 obj1 = new Modifier2();
        Modifier2 obj2 = new Modifier2();
        Modifier2 obj3 = new Modifier2();
    }
}