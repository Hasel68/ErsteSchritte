
public class Multithreading01 {
	public static void main(String[] args) {
	Multithreading t1 = new Multithreading(" erster thread");
	Multithreading t2 = new Multithreading(" zweiter thread");
	
	t1.start();
	t2.start();
	
	}

}
