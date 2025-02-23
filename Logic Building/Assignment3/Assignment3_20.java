class Pattern11
{
public static void main(String[] argc)
	{
	    for(int i = 1; i <= 5; i++)
		{
		  for(int j = 1, k = 5; j<=i; j++, k--)
			{
			 if(j==i)    
			 {System.out.print(k);}
			 else
			  {System.out.print(k + "*");}

			}
	   System.out.println();
		}

	}

}