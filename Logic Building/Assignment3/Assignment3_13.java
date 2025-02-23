class Pattern3
{
 public static void main(String argc[])
	{
	   for(int i = 1; i < 5; i++)
	     {
		
		for(int j = 1; j<=i ; j++)
	          {
		     System.out.print(i + "*");
		  }
		System.out.println();
	     }

	   for(int i = 1, k = 5; i <=5; i++, k--)
	     {
				
		for(int j = 5; j>=i; j--)
		   {
			System.out.print( k + "*");			
		   }
		
		System.out.println();
		
	     }
}
}