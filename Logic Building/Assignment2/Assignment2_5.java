import java.util.Scanner;

class Status
{
public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Student DSA Mark : ");
int a = scn.nextInt();

System.out.println("Enter Student OS Mark: ");
int b = scn.nextInt();

System.out.println("Enter Student Java Mark: ");
int c = scn.nextInt();

int failedstudent = 0;




switch(a<=40 ? 1 : 0)
{
	case 1:
		failedstudent++;
		break;
	
}

switch(b<=40 ? 1 : 0)
{
	case 1:
		failedstudent++;
		break;
	
}

switch(c<=40 ? 1 : 0)
{
	case 1:
		failedstudent++;
		break;
	
}

if (failedstudent == 0)
{
	
System.out.println("Passed in All Subjects");
}
else
{
System.out.println("Student Failed in "+ failedstudent + " Subject");

}
}


}