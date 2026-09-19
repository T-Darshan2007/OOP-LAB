public class HyphensOverHastag {
    public static void main(String[] args) {
        String str = "Hello#World#This#is#Java";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '#'){
                System.out.print("-");
            }
            else
                System.out.print(ch);
        }
    }
}
