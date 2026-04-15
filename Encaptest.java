class Encapsulation{
    private int ssn;
    private String empname;
    private int empno;

    public int getssn(){
        return ssn;
    }

    public String getname(){
        return empname;
    }

    public int getno(){
        return empno;
    }

    public void setssn(int id){
        ssn = id;
    }

    public void setname(String name){
        empname = name;
    }

    public void setno(int no){
        empno = no;
    }
}


public class Encaptest {
    public static void main(String[] args){
        Encapsulation ob = new Encapsulation();
        ob.setssn(25);
        ob.setname("Ajith");
        ob.setno(1234);
        System.out.println("Emp id: " + ob.getssn());
        System.out.println("Emp name: " + ob.getname());
        System.out.println("Emp no: " + ob.getno());
    }
}
