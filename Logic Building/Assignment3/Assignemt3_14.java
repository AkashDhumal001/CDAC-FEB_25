class Pattern6{
public static void main(String argc[])
	{
	for(int i = 0; i <= 6; i++)
	{
	   for(int j = 6; j>=i ; j--)
		{
		   System.out.print(" ");
		}
	   for(int j = 1; j<=i; j++)
		{
		  System.out.print("* ");
		}
	   System.out.println();

	}
	}


}