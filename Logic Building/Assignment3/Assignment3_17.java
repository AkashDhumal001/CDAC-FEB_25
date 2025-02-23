class Pattern8
{
 public static void main(String argc[])
	{

	  for(int i = 1, k = 5; i<=5; i++,k--)
		{
		   for(int j = 1; j>=i; j++)
			{
			  System.out.print(" ");
			}
		   for(int j = 1; j<k; j++)
			{
			  System.out.print("* ");
			}
	 	 System.out.println();
		
		}
	
	}


}