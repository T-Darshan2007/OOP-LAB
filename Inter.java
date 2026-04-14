interface parent{
    void view();
}

interface parent1{
    public void view1();
}

class child implements parent, parent1{
    public void view(){
        System.out.println("Hello, Parent");
    }

    public void view1(){
        System.out.println("Hello, Parent1");
    }
}

public class Inter{
    public static void main(String[] args) {
        child ob = new child();
        ob.view();
        ob.view1();
    }
}