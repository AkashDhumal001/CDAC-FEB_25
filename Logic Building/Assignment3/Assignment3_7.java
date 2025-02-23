import java.util.Scanner;

class Add
{
	public static void main(String argc[])
	    {
		Scanner scn = new Scanner(System.in);
		int num  =  scn.nextInt();
		
		int rem, sum = 0;
		while(num!=0)
		  {
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		  }
		System.out.println("Sum of all digits is " + sum);

	    }

}