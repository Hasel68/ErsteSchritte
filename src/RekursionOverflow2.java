
public class RekursionOverflow2 {

	public static void main(String[] args) {
		
		long[] fibos = new long[100];
	   
		for(int i = 1; i < 100; i++)
	    {
	    	if(fibos[i] == 0)
	    	{
	    		fibos[i] = fibo(i, fibos);
	    	}
	    }
		System.out.println(fibos[10]);
	 }
		public static long fibo(int n, long[] fibos) 
		{
			if(n == 1) 
			{
				return 1;
			}
			
			if(n == 0)
			{
				return 0;
			}
			
			if(fibos[n-1] == 0) 
			{
				fibos[n-1] = fibo(n-1, fibos);
			}
			
			if(fibos[n-2] == 0) 
			{
				fibos[n-2] = fibo(n-2, fibos);
			}
			
			return fibos[n-1] + fibos[n-2];
		}
	
}
