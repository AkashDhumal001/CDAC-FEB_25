class Fibonacci
{
  public static void main(String argc[])
     {
	
	int num1 = 0, num2 = 1;
	for(int i = 0; i <= 21 ; i++)
	  {
		System.out.print(num1 + " ");
		int num3 = num1+num2;
		num1 = num2;
		num2= num3;
		
	  }

      }

}