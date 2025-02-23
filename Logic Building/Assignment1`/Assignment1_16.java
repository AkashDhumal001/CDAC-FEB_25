import java.util.Scanner;
class Prime
{

public static void main(String argc[])
    {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter Number To Check");
	int num = scn.nextInt();
	boolean istrue = false;


	for(int i=2; i<=num/2; i++)
		{
			if(num%i == 0)
				{
				istrue = true;
				
				}
			else
				{
				istrue = false;
				}
		}
	   if(istrue == true)
		{
			System.out.println(num + " Number is not  Prime");
		}
	   else
		{
			System.out.println(num + " Number is Prime");
		}
	

      }

}