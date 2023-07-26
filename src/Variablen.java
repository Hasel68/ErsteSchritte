
public class Variablen {

	public static void main(String[] args) {
         double zahl;
         // int für kleine Zahlen. double für Zahlen mit Nachkommastellen (auf die 10te Nachkommastelle wird manchmal gerundet um die Zahlen speichern zu können. Dadurch ist das ergebnis nicht zu 100% richtig). long für sehr große Zahlen.
         zahl = 10.5;
         zahl += 10 + 5 * 3;
         System.out.println(zahl);
	}

}
