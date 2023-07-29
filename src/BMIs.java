import java.util.Scanner;

public class BMIs {

	public static void main(String[] args) {
	
 	    System.out.println("Geben Sie ihr Geschlecht ein:");
		Scanner scanner = new Scanner(System.in);
		
		String Geschlecht = scanner.nextLine();
		
		try (Scanner sc = new Scanner(System.in)) {
			float groesse;
			float gewicht;
			float bmi;
		
			
		
			
			if(Geschlecht.equals("m")) 
			{
			
				System.out.println("Wie gross bist Du (Meter)?");
				groesse = sc.nextFloat();
				
				System.out.println("Wie viel wiegst du (Kilogramm)");
				gewicht = sc.nextFloat();
				
				bmi = gewicht / (groesse * groesse);
				
				System.out.println(" Dein BMI lautet:" + bmi);
				
				if(bmi < 18)
				{
					System.out.println("Du hast Untergewicht.");
				}
				else if(bmi > 34)
				{
					System.out.println("Du hast Uebergewicht.");
				}
				
				else
				{
					System.out.println("Du hast ein Idealgewicht.");
				}			

			}
			
			
			else if(Geschlecht.equals("f"))
			{
				System.out.println("Wie gross bist Du (Meter)?");
				groesse = sc.nextFloat();
				
				System.out.println("Wie viel wiegst du (Kilogramm)");
				gewicht = sc.nextFloat();
				
				bmi = gewicht / (groesse * groesse);
				
				System.out.println(" Dein BMI lautet:" + bmi);
				
				if(bmi < 15)
				{
					System.out.println("Du hast Untergewicht.");
				}
				else if(bmi > 29)
				{
					System.out.println("Du hast Uebergewicht.");
				}
				
				else
				{
					System.out.println("Du hast ein Idealgewicht.");
				}
				
			}
		}
		
	}

}
