import java.util.*;

public class Vote{
	public static void main(String[] Args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your age to check vote eligibility:");
		int age=obj.nextInt();
		if (age>=18){
			System.out.println("Eligible for vote");
		}
		else{
			System.out.println("Not eligible for vote");
		}
	}
}
	