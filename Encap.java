class Vote{
    private String name;
    private int age;
    public Vote(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }
}

public class Encap {
    public static void main(String[] args){
        Vote ob = new Vote("Ajith", 55);
        System.out.println(ob.getname());
        System.out.println(ob.getage());

    }
}
