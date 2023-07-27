
public class Methode2 {

	public static void main(String[] args) {
		
	 for(int i = 0; i < 10; i++)   // Es wird 10 Mahl diese Schleife ausgeführt. Da die darauffolgende Schleife 20 wiederholungen hat wird der Vorgang 200 mahl ausgeführt. 10 * 20.
	 {
		 for(int j = 0; j < 20; j++)
		 {
			 System.out.println(plus(i, j));
		 }
	   }
	}
	 public static int plus(int a, int b)
	    {
		 return a+b;
		 
	    }

	 }
