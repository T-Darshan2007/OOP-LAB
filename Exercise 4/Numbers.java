import java.util.*;

class Numbers{
	public static void main(String[] Args){
		System.out.println("Enter a number to check a tha number is odd or even:");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		
		if (a%2==0){
			System.out.println("The Number "+a+" is even");
		}

		else{
			System.out.println("The Number "+a+" is odd");
		}
	}
}