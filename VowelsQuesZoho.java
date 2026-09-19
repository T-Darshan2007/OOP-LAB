public class VowelsQuesZoho {

    static boolean vowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }

    static void check(String str) {
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (vowel(ch)) {

            while (i + 1 < str.length() && vowel(str.charAt(i + 1))) {
                System.out.print(ch);
                i++;
                System.out.print(str.charAt(i));
            }
        }
        else {
            System.out.print(ch);
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        check("Cat");
        check("Compuuter");
        check("aeiou");
    }
}
