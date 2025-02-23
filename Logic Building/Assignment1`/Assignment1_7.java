/*7. Multiplication Table
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
 Input a number: 8
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80*/
import java.util.Scanner;
class Table
{
public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Number to Print Table");
int a = scn.nextInt();

System.out.println(a*1);
System.out.println(a*2);
System.out.println(a*3);
System.out.println(a*4);
System.out.println(a*5);
System.out.println(a*6);
System.out.println(a*7);
System.out.println(a*8);
System.out.println(a*9);
System.out.println(a*10);

}

}