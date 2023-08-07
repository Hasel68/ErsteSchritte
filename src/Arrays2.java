
public class Arrays2 {

	public static void main(String[] args) {
		
		String [] array = new String [4];   //Es wird ein Array das 4 Strings gross ist erstellt.
		
		array[0] = "Hallo";            //Die Stellen im Array werden zugewiesen.
		array[1] = "du";
		array[2] = "bist";
		array[3] = "cool";
		
		for (int i = 0; i < array.length; i++)    //Arrays werden bis 4 hochgezaehlt und ausgegeben.
		{
			System.out.println(array[i] + "");
		}
								
			

	}

}
