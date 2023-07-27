
public class MethodeÜberladen {

	public static void main(String[] args) {
		System.out.println(plus(5,3));
		System.out.println(plus(5, 3, 6));
		System.out.println(plus(5));
		System.out.println(plus(5.5, 11.5));

	}
	 public static int plus(int a, int b)
	    {
		 System.out.println("Du hast die erste Methode benutzt.");
		 return a+b;
	    }
	 
	 public static int plus(int a, int b, int c)
	    {
		 return a+b+c;
	    }
	 
	 public static int plus(int a)
	    {
		 return a+20;	 
	    }
	 
	 public static double plus(double a, double b)
	    {
		 return a+b;
	    }

	 }
