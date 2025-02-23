import java.util.Scanner;
class Reverse
{

public static void main(String argc[])
	{	//Requirements
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number in Correct Order : ");
		int num = scn.nextInt();
		int rev = 0;
		int rem;
		
		//Logic
		while(num>0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		
		
		}
	System.out.println("Reversed Number : " + rev);
	}

}