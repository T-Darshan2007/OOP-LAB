class Parent{
    public void view(){
        System.out.println("Parent");

    }
}

class Child extends Parent{
    @Override
    public void view(){
        System.out.println("Child");
    }
}

public class Main3{
    public static void main(String[] args) {
        Parent ob = new Parent();
        ob.view();
        Child ob1 = new Child();
        ob1.view();
    }
}