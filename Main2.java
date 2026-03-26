class Vehicle{
    public void view(){
        System.out.println("Vehicle is parked");
    }
}

class Car extends Vehicle{
    @Override
    public void view(){
        System.out.println("Car is parked");
    }
}

public class Main2{
    public static void main(String[] args) {
        Car ob = new Car();
        ob.view();
        Vehicle ob1 = new Vehicle();
        ob1.view();
    }
}