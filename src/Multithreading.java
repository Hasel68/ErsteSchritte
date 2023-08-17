
public class Multithreading extends Thread{
	
	String name;
	
	Multithreading(String s){
		this.name = s;
	}

	public void run (){
		
		System.out.println("Starte Thread" + name);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Beende Thread" + name);

	}

}
