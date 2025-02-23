import java.util.Scanner;

class Average
{

	public static void main(String argc[])
	{	
		//Requirement
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int a = scn.nextInt();
		System.out.println("Enter Number 2 : ");
		int b = scn.nextInt();
		System.out.println("Enter Number 3 : ");
		int c = scn.nextInt();
		int Avg; 

		//Logic Average
		Avg = (a+b+c)/3;
		
		//Return
		System.out.println("Average of 3 numbers is: " + Avg );
		
	}

}