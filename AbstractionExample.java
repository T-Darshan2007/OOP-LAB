abstract class AnimalA {
    abstract void sound();
}

class Cow extends AnimalA {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        AnimalA a = new Cow();
        a.sound();
    }
}