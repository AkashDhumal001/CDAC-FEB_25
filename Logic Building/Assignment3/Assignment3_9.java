import java.util.Scanner;

class Largest
{
   public static void main(String argc[])
	{
	   Scanner scn = new Scanner(System.in);
	   int num = scn.nextInt();
	   int largest = 0;
	   int rem;

	   while(num!=0)
	     {
		rem = num%10;
		if(rem > largest)
		   {
			largest = rem;
		   }
		num = num/10;
		
		
	     }
	   System.out.println(largest);
	}
}