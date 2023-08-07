
public class ArrayUndFor {

	public static void main(String[] args) {
        int[] asdf = new int[10];
        int[] wasd = new int [5];
        for(int zaehler = 0; zaehler < 5; zaehler++)
        {
        	asdf[zaehler] = zaehler + 5;
        	wasd[zaehler] = asdf[zaehler] * 12;	
        }
        for(int i = 0; i < 10; i++)
        {
        	System.out.println(asdf[i] * wasd[i % 5]);   // Mit % kann man bis einschließlich 4 rechnen lassen. Die 5 geht in sich selber rein und wird 0. Es wird mit Resten gerechnet ( wie oft passt die 5 in die 3 = 0 Mahl.
        }
	}

}
