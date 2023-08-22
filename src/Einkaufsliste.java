import java.util.ArrayList;
import java.util.Scanner;

public class Einkaufsliste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> Einkaufsliste = new ArrayList<String>();
		
		System.out.println("Moechten Sie Einkaufen gehen? j/n");
		String antwort = sc.next();

		
		
		
			if(antwort.equals("j"))
			{
				System.out.println("Brauchen wir noch etwas?");
				String produkt = sc.next();
				Einkaufsliste.add(produkt);
				
				 if(antwort.equals("n"))
				{
					 break;
				}
				 
				 else if(antwort.equals("n"))
				 {
				 }

			}
			
			
	}
	

	}


