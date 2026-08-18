public class switchCase1 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1 -> System.out.println("Lucky one");
            case 2 -> System.out.println("Second one");
            case 3 -> System.out.println("Third one");
            case 4 -> System.out.println("Best one");
            case 5 -> System.out.println("Better one");
            default -> System.out.println("Enter a valid one;");
        }
    }
}
