

public class Calculator{
    public void add(int num1, int num2){
        System.out.println("add :" + (num1+num2));
    }

    public void sub(int num1, int num2){
        System.out.println("sub :" + (num1-num2));
    }

    public static void main(String[] args) {
        Calculator ob = new Calculator();
        ob.add(10, 11);
        ob.sub(13, 3);
    }
}