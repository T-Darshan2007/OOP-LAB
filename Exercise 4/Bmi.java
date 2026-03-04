import java.util.*;

public class Bmi{
	public float bmi(float a, float b){
		return (a/(b*b));
	}
	
	public static void main(String[] Args){
		Bmi myobj=new Bmi();
		Scanner obj=new Scanner(System.in);
		System.out.println("To Calculate BMI:");
		System.out.println("Enter your weight in Kg:");
		float w=obj.nextFloat();
		System.out.println("Enter your height in meters:");
		float h=obj.nextFloat();
		float ans=myobj.bmi(w,h);
		System.out.println("BMI:"+ans);
		if (ans>=0 && ans<=18.5){
			System.out.println("Verdict : Underweight");
		}
		else if (ans>18.5 && ans<=24.9){
			System.out.println("Verdict : Normal");
		}
		else if (ans>=25.0 && ans<=29.9){
			System.out.println("Verdict : Overweight");
		}
		else if (ans>=30){
			System.out.println("Verdict : Obese");
		}
	}
}