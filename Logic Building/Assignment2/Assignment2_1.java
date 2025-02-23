import java.util.Scanner;

class Grades
{
public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Number: ");
int marks = scn.nextInt();



if(marks>=90 && marks<=100)
 {
 System.out.println("Grade Acvhived :  A");
 }


}
else if(marks>=80 && marks<=89)
{
System.out.println("Grade Acvhived :  B");
}
else if (marks>=70 && marks<=79)
{
System.out.println("Grade Acvhived :  C");
}
else if (marks>=60 && marks<= 69)
{
System.out.println("Grade Acvhived :  D");
}
else
{
System.out.println("Fail");
}



}


}