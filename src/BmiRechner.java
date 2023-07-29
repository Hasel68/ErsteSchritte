import java.util.Scanner;

public class BmiRechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float groesse;
		float gewicht;
		float bmi;
		
		System.out.println("Wie gross bist Du (Meter)?");
		groesse = sc.nextFloat();
		
		System.out.println("Wie viel wiegst du (Kilogramm)");
		gewicht = sc.nextFloat();
		
		bmi = gewicht / (groesse * groesse);
		
		System.out.println(" Dein BMI lautet:" + bmi);
		
		if(bmi < 16)
		{
			System.out.println("Du hast Untergewicht.");
		}
		else if(bmi > 30)
		{
			System.out.println("Du hast Übergewicht.");
		}
		
		else
		{
			System.out.println("Du hast ein Idealgewicht.");
		}
		
	}

}
