import java.util.Scanner;

public class BMICalculator {

    static void bmi(double bmi){
        if(bmi<=18.5){
            System.out.println("Verdict:- " + "Underweight");
        }
        else if(bmi>18.5 && bmi<=24.9){
            System.out.println("Verdict:- " + "Healthy weight");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("Verdict:- " + "Overweight");
        }
        else{
            System.out.println("Verdict:- "+"Obesity");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your weight(kg) and Height(cm) to calculate BMI:-");
        Scanner inp = new Scanner(System.in);
        double weight = inp.nextDouble();
        double height = inp.nextDouble();
        double bmi = (weight)/(height/100);
        System.out.println("BMI:- " + bmi);
        bmi(bmi);
    }
}
