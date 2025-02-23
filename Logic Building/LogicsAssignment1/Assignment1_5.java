/*5. Multiply Two Numbers
Write a Java program that takes two numbers as input and displays the product of the two numbers.
Test Data:
 Input first number: 25
 Input second number: 5
Expected Output:
25 x 5 = 125*/


import java.util.Scanner;

class Multiply
{

public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);
//Enter First Number
System.out.println("Enter First Number: ");

//Enter Second number
int a = scn.nextInt();
System.out.println("Enter Second Number: ");

int b = scn.nextInt();
System.out.println("Multiplication is : "+ a*b);

//Closing the scanner to release resources
scn.close();

}

}

//Output
/*Enter First Number:
25
Enter Second Number:
5
Multiplication is : 125*/