import java.util.Scanner;

class Weekdays
{
public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Number to find day of that Number :  ");
int cond = scn.nextInt();

switch(cond)
    {
	case 1:
		System.out.println("Monday");	
	break;
	
	case 2:
		System.out.println("Tuesday");
	break;
	
	case 3:
		System.out.println("Wednesday");
	break;

	case 4:
		System.out.println("Thursday");
	break;

	case 5:
		System.out.println("Friday");
	break;

	case 6:
		System.out.println("Saturday");
	break;
		
	case 7:
		System.out.println("Sunday");
	break;
    }

}


}