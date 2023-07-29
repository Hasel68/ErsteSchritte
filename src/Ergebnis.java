
public class Ergebnis {

	public static void main(String[] args) {
		
		Tier.getPlanet(); 
		
		Tier t = new Hund();
		t.setBeine(4);
		t.atme();
		Lebewesen l = new Fisch();
		l.atme();
		//System.out.println(t.beine);
		Lebewesen[] ls = new Lebewesen[10];   //Array
		for(int i = 0; i < 10; i++)
		{
			ls[i] = new Fisch();
    //  	ls[i].atme();
		}
		
		ls[5] = new Hund();
		ls[4] = new Hund();
		
		for(int i = 0; i < 10; i++)
		{
	//		ls[i] = new Fisch();
			ls[i].atme();
		}
		
	
		
	
		
	//  Tier t = new Hund();
	//	Hund h = (Hund)t;
		
	//	System.out.println(h.macheDichBemerkbar() + h.gibRasseZurück());
	//	l.atme();
	//	System.out.println(t.macheDichBemerkbar());
	}

}
