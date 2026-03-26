class Animal{
    public void eat(){
        System.err.println("Eating");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}

public class Main{
    public static void main(String[] args){
    Dog ob = new Dog();
    ob.bark();
    ob.eat();
    }
}