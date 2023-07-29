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
			
			if(Geschlecht.equals("Mann")) 
			{
			
				System.out.println("Wie gross sind Sie in Meter?");
				groesse = sc.nextFloat();
				
				System.out.println("Wie viel wiegen Sie in Kilogramm?");
				gewicht = sc.nextFloat();
				
				bmi = gewicht / (groesse * groesse);
				
				System.out.println("Ihr BMI lautet:" + bmi);
				
				if(bmi < 18)
				{
					System.out.println("Sie haben Untergewicht.");
				}
				else if(bmi > 34)
				{
					System.out.println("Sie haben Uebergewicht.");
				}
				
				else
				{
					System.out.println("Sie haben ein Idealgewicht.");
				}			

			}
				
			else if(Geschlecht.equals("Frau"))
			{
				System.out.println("Wie gross sind Sie in Meter?");
				groesse = sc.nextFloat();
				
				System.out.println("Wie viel wiegen Sie in Kilogramm?");
				gewicht = sc.nextFloat();
				
				bmi = gewicht / (groesse * groesse);
				
				System.out.println(" Ihr BMI lautet:" + bmi);
				
				if(bmi < 15)
				{
					System.out.println("Sie haben Untergewicht.");
				}
				else if(bmi > 29)
				{
					System.out.println("Sie haben Uebergewicht.");
				}
				
				else
				{
					System.out.println("Sie haben ein Idealgewicht.");
				}
								
			}
			else 
			{
				System.out.println("Sie müssen ihr Geschlecht ausschreiben (Frau/Mann).");
			}
		}
		
	}

}
