
public class Switch {

	public static void main(String[] args) {

		  int monat = 3;    //Geht auch mit; char monat ="f";  //Auch mit: strings monat = "februar"; 
		  
		  switch(monat)
		  {
		  case 1: System.out.println("Januar");    // j
		  break; // Schleife wird abgebrochen und Vorraussetzungen werden erneut geprüft.
		  case 2: System.out.println("Februar");   // f
		  break;
		  case 3: System.out.println("Maerz");   //m
		  break;
		  default: System.out.println("Nicht im 1. Quartal.");
		  break;
		  }
	}

}
