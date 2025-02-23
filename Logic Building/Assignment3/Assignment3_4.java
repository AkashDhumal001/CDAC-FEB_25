class Reverse
{
 public static void main(String argc[])
     {	
	int rem;
	int rev = 0;
	int num = 1234;
	while(num != 0)
	   {
		rem = num%10;
		rev = (rev*10)+rem;
		num = num/10;
		

	   }
	 System.out.println(rev);



     }

}