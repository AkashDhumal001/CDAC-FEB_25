import java.util.Scanner;

class Power
{
public static void main(String argc[])
{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter Base number");
	int base = scn.nextInt();
	System.out.println("Enter Exponent Number");
	int expo = scn.nextInt();
	int result= 1;

	for(int i = 1; i <=expo; i++)
	{
 
	result= result* base;

	}
    System.out.println("power is " + result);
}
}