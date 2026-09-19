public class MoveHastagsForward {
    public static void main(String[] args) {
        String str = "Hello#World#This#is#Java";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '#'){
                System.out.print(ch);
            }
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != '#'){
                System.out.print(ch);
            }
        }
    }
}
