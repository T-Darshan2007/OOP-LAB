public class Div{
    public int ssr(int a, int b){
        return (a + b);
    }

    public int ssr(int a, int b, int c){
        return (a + b + c);
    }

    public float ssr(float a, float b){
        return (a + b);
    }

    public static void main(String[] args) {
        Div ob = new Div();
        System.out.println(ob.ssr(2, 3));
        System.out.println(ob.ssr(2, 3, 4));
        System.out.println(ob.ssr(2.5f, 3.5f));
    }
}