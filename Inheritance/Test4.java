class Vehicle {
    int speed = 60;
}

class Car extends Vehicle {
    int speed = 100;

    void display() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed);
    }
}

class Test4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}