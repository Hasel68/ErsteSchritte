import java.util.Scanner;

public class Hangman {

	private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };      //im String werden die Wörter gespeichert.
	private static String word = words[(int) (Math.random() * words.length)];                           //hier wird ein zufälliges Wort genommen.
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");            //Das Wort wird mit *** angezeigt.
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 7 && asterisk.contains("*")) {                                      //hier werden die vorgegebenen Szenarien hochgezählt (Galgen).
			System.out.println("Guess any letter in the word");                            //wenn 7 erreicht ist ist das Spiel beendet.
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();                                                                                       // eingabe beendet.
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {                      //Der erratene Buchstabe wird aufgedeckt.
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {                       //bei falsch bleibt alles gleich.
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";                                       //Buchstabe bleibt verdeckt.
			}
		}

		if (asterisk.equals(newasterisk)) {                              //Wenn die Antwort falsch ist wird der Galgen hochgezählt.
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {                                     // alle Buchstaben wurden aufgedeckt und du gewinnst.
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}