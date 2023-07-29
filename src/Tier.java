
public abstract class Tier implements Lebewesen{
	
	//    final double pi = 3.14;     //kann nicht mehr verändert werden.
		private int beine;         // private lääst nur die eigene Klasse darauf zugreifen.      //protected ist für alle Klassen im Paket sichtbar.
		
		public static String getPlanet()     // Alle Tiere leben bedingungslos auf der Erde.
		{
			return "Erde";
		}
		public void setBeine(int beine)
		{
			if(beine < 0)
			{
				this.beine = 0;
				return;
			}
			this.beine = beine;
		}                                         //Wichtig Setter unf Getter
		
		
		public int getBeine()
		{
			verliereEinBein();
			return beine;	
			
		}
		
		private void verliereEinBein()
		{
			if(beine < 1)
			{
				return;
			}
			this.beine--;
		}
		public String macheDichBemerkbar()
		{
			return "hey";
		}
		
		public abstract void laufe();

}
 