
public class Hund extends Tier  {
	
	String rasse = "ich bin ein Dobermann.";
	
	public String gibRasseZurück()
	{
		return rasse;
	}
	public String macheDichBemerkbar()
	{
		return "Wuff, ";
	}
	
	public void atme()
	{
		System.out.println("hechel");
	}
	@Override
	public void laufe() {
		
		System.out.println("hüpf");		
	}
	

}
