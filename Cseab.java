package Firstpack;
public class Cseab{
    int num1, num2;
    Cseab(int m, int n){
        num1 = m;
        num2 = n;
    }

    public void getmax(){
        if (num1>num2){
            System.out.println("The max no: " + num1);
        }

        else{
            System.out.println("The max no: " + num2);
        }
    }

    public static void main(String[] args) {
        Cseab ob = new Cseab(20, 12);
        ob.getmax();
    }
}