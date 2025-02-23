class Prime
{
   public static void main(String argc[])
	{
	   int count = 0;
	   
	   		for(int i = 2; i < 100 ; i++)
		   {
			if(i%2 == 0)
			   {
				continue;
			   }
			else
			   {	
				
				System.out.println(i + "Is Prime");
				count++;
				if(count == 5)
				  {
				    break;
				  }
			   }
		   }

	}


}