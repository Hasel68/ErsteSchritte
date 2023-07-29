
public class VererbungErgebnis {

	public static void main(String[] args) {
		
		VererbungTier t = new VererbungTier();
		t.atme();
		InterfaceLebewesen l = new InterfaceFisch();
		l.atme();
		
		InterfaceLebewesen[] ls = new InterfaceLebewesen[10];   //Array
		for(int i = 0; i < 10; i++)
		{
			ls[i] = new InterfaceFisch();
    //  	ls[i].atme();
		}
		
		ls[5] = new VererbungHund();
		ls[4] = new VererbungTier();
		
		for(int i = 0; i < 10; i++)
		{
	//		ls[i] = new InterfaceFisch();
			ls[i].atme();
		}
		
	
		
	
		
	//  VererbungTier t = new VererbungHund();
	//	VererbungHund h = (VererbungHund)t;
		
	//	System.out.println(h.macheDichBemerkbar() + h.gibRasseZurück());
	//	l.atme();
	//	System.out.println(t.macheDichBemerkbar());
	}

}
