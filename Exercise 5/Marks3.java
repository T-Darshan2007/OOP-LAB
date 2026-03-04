import java.util.*;

public class Marks3{
	public static void main(String[] Args){
		Scanner obj=new Scanner(System.in);
		int math, phy, che, eng, comp;
		double finalscore;
		int number=obj.nextInt();
		for(int i=0; i<number; i++){
		System.out.println("Student"+(i+1)+":");
		System.out.println("Enter the maths, physics, chemistry, english, computer marks respectively:");
		math=obj.nextInt();
		phy=obj.nextInt();
		che=obj.nextInt();
		eng=obj.nextInt();
		comp=obj.nextInt();
		finalscore=(math+phy+che+eng+comp)/5;
		System.out.println("Final Score:"+finalscore);
		System.out.println("Verdict:");
		if (finalscore>=90 & finalscore<=100)
			System.out.println("Excellent");
		else if (finalscore<90 && finalscore>=80)
			System.out.println("V.good");
		else if (finalscore<80 && finalscore>=70)
			System.out.println("Good");
		else if (finalscore<70 && finalscore>=60)
			System.out.println("Better");
		else if (finalscore<60 && finalscore>=0)
			System.out.println("Poor");
		}
	}
}