class Fibonacci
{

	public static void main(String argc[])
	{
		int num1 = 0;
		int num2 = 1;
		int nextterm;

		for(int i = 0; i <= 10; i++ )
			{
				System.out.print(num1 + " ");
				nextterm = num1 + num2;
				num1 = num2;
				num2 = nextterm;

				
				
			}

	 }

}