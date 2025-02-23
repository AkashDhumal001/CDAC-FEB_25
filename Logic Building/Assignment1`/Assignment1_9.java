/*
9. Calculate the Area of a Circle
Write a Java program that calculates the area of a circle.
Test Data:
 Input the radius: 7
Formula: Area = π * radius²
Expected Output:
Area of the circle: 153.93804
*/

import java.util.Scanner;

class Area
{

public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);
System.out.println("Enter Radius of Circle: ");
int r = scn.nextInt();
float a ;
a = 3.14f *r*r;
System.out.println("Area Of the Circle is: "+ a);



}

}
