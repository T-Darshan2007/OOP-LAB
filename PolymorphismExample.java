class AnimalP {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends AnimalP {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        AnimalP a = new Cat();
        a.sound();
    }
}