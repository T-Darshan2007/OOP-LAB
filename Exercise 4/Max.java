import java.util.*;

public class Max{
	public static void main(String[] Args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter three numbers so that maximum number can find:");
		float a=obj.nextFloat();
		float b=obj.nextFloat();
		float c=obj.nextFloat();
		
		if (a>b && a>c){
			System.out.println("Maximum number is:"+a);
		}

		else if (b>a && b>c){
			System.out.println("Maximum number is:"+b);
		}

		else{
			System.out.println("Maximum number is:"+c);
		}
	}
}