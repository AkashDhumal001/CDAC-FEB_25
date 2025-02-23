import java.util.Scanner;

class Calculator
{
public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Number 1:  ");
int a = scn.nextInt();
System.out.println("Enter Number 2:  ");
int b = scn.nextInt();



System.out.println("Enter 1 for Addition");
System.out.println("Enter 2 for Substraction");
System.out.println("Enter 3 for Multiplication");
System.out.println("Enter 4 for Division");
int ch = scn.nextInt();

switch(ch)
{
	case 1:

		System.out.println("Addition Of 2 Number is : "+ (a+b));
		break;
	case 2:
		System.out.println("Substraction Is : " + (a-b));
		break;
	case 3:
		System.out.println("Multiplication is: "+ (a*b));
		break;
	case 4:
		if(b==0)
		{
		System.out.println("Error: Please Do not Enter 0 at Denominator");
		}
		else
		{
		System.out.println("Division Is : "+ (double)(a/b));
		}	
		

}





}


}