import java.util.Scanner;

class Discount
{
public static void main(String argc[])
{

Scanner scn = new Scanner(System.in);

System.out.println("Enter Purchase Amount :   ");
int a = scn.nextInt();


if(a>=1000)
{
double discounted = a - (a * ( 20.0/100));

System.out.println("We have applied 20% discount on your purchase, Final Amount is :  "+ discounted);
}
else if (a<=999 && a>=500)
{
double discounted = a - (a*(10.0/100));
System.out.println("Wehave applied 10% discount on your purchase, Final Amount is :  "+ discounted);
}
else
{
double discounted = a-(a* (5.0/100));
System.out.println("Wehave applied 5% discount on your purchase, Final Amount is :  "+ discounted);
}





}


}