
public class Strings {

	public static void main(String[] args) {
		String s = "a  s d f";
		String sOhneLeerzeichen = s.trim().toLowerCase();    // Diese Zeile dient dazu Fehler bei der eingabe zu beseitigen. Es sind 2 Funktionen. Die eine löscht die Leerzeichen und die andere wandelt alles in Kleinbuchstaben um. 
		String w = new String("wasd");
		
		String  text= "Dies ist ein Text; in dem ein Suchwort vorkommt";
		String search = "Suchwort";
		int position = text.indexOf(search );
		
		System.out.println(search);
		
	
		
		
			
	}

}
 