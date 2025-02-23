
/*8. Swap Two Numbers
Write a Java program to swap the values of two variables without using a third variable.
Test Data:
 Input first number: 10
 Input second number: 20
Expected Output:
Before swapping:
First number: 10
Second number: 20
After swapping:
First number: 20
Second number: 10*/

import java.util.Scanner;

class Swap
{

public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);
System.out.println("Enter First Number");
int a = scn.nextInt();
System.out.println("Enter Second Number");
int b = scn.nextInt();

int temp;
//by assignment Method
System.out.println("Using Assignment Method");
temp = a;
a = b;
b = temp;
System.out.println("A = " + a);
System.out.println("B = " + b);

System.out.println("Using Addition and Substraction");

a = a+b;
a = a-b;
b = a-b;
System.out.println("A = " + a);
System.out.println("B = " + b);


}

}