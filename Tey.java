class Vote{
    private String name;
    private int age;

    public Vote(String nam, int ag){
        name = nam;
        if (ag>=18){
            age = ag;

        }

        else {
            System.out.println("Not eligible for vote;");
        }

    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }
}

public class Tey{
    public static void main(String[] args) {
        Vote ob = new Vote("Ajith", 17);
        System.out.println(ob.getname());
        System.out.println(ob.getage());
    }
}