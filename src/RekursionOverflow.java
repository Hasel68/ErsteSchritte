
public class RekursionOverflow {
	
	public static void main(String[] args) {
		System.out.println(fakult(10));
	}
	public static int fakult(int n)            //Eine Fakultät ist z.B. 5! = 5*4*3*2*1
	{
		if(n < 0)
		{
			return 0;
		}
			
			if(n == 0)
			{
				return 1;
			}
				
		if(n == 1)
		{
			return 1;
		}
		else 
		{
			return n* fakult(n-1);
		}
	}

}
