class Grand{
    public void old(){
        System.out.println("Old Age");
    }
}

class Adult extends Grand{
    public void mid(){
        System.out.println("Adult age");
    }
}

class Child extends Adult{
    public void small(){
        System.out.println("Small Age");
    }
}

public class Main1{
    public static void main(String[] args) {
        Child ob = new Child();
        ob.small();
        ob.mid();
        ob.old();
    }
}