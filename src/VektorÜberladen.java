
public class VektorÜberladen {
	
	public static void main(String[] args) {
	
	Vektor v = new Vektor ();
	Vektor v2 = new Vektor (1, 2, 3); //Jedes Ergebnis hat eine eigene Methode zugewiesen bekommen.
	v.x = 1;
	v.y = 0;
	v.z = 0;
	
	Vektor v3 = v.add(v2);
	System.out.println(v3.toString());
	}

}
