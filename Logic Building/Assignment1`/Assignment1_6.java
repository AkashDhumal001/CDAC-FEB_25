/*6. Basic Arithmetic Operations
Write a Java program to print the sum, multiplication, subtraction, division, and remainder of two numbers.
Test Data:
 Input first number: 125
 Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

import java.util.Scanner;

class Arithmatic
{

public static void main(String argc[])
{
//Creating Object of lib scanner
Scanner scn = new Scanner(System.in);
//input a & b
System.out.println("Enter First Number");
int a = scn.nextInt();
System.out.println("Enter Second Number");
int b = scn.nextInt();

System.out.println("Arithmatic Operations");
System.out.println("A+B " + (a+b));
System.out.println("A-B " + (a-b));
System.out.println("A*B " + (a*b));
System.out.println("A/B " + (a/b));
System.out.println("A%B " + (a%b));


}

}

//OutPut
/*E:\JAVALogic\Assignment 1>javac Assignment1_6.java

E:\JAVALogic\Assignment 1>java Arithmatic
Enter First Number
125
Enter Second Number
24
Arithmatic Operations
A+B 149
A-B 101
A*B3000
A/B 5
A%B 5*/