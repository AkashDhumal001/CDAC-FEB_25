class Pattern10
{
 public static void main(String argc[])
    {
	for(int i = 1; i <=6; i++)
	    {
		for(int j = 1; j<=i; j++)
		   {
			if(j==i)
			{System.out.print(j);}
			else
			{System.out.print(j + "*");}

			}
		System.out.println();

	    }

    }


}