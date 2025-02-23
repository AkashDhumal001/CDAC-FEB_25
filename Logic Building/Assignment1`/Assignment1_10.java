/*10. Check If a Number Is Even or Odd
Write a Java program that checks if a number is even or odd.
Test Data:
 Input a number: 15
Expected Output:
The number 15 is Odd.*/


import java.util.Scanner;

class Evenodd
{

public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Number to Check: ");
int n = scn.nextInt();

if(n%2 == 0)
{
System.out.println("Number is Even");
}
else
{
System.out.println("Number is Odd");
}

}

}