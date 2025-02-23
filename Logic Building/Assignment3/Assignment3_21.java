class Pattern12
{

public static void main(String argc[])
	{
	  for(int i = 1; i <=5; i++)
		{
	          for(int j = 1,k =1; j<=i; j++,k+=2)
			{
			  if(i==j)
			    {System.out.print(k);}
			  else
			    {System.out.print(k + "*");}
			}
		System.out.println();
		}
	}

}