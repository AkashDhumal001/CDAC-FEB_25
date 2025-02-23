class fordemo1{

public static void main(String[] args)
{

/*for(int a = 10;  ; a--)
	{
  	
	   System.out.println(a)

	} infinite loop
*/

/*for(int a = 10;a <=5; )
	{
  	
	   System.out.println(a)

	} infinite loop*/

for(int a = 10;  ; a--)
	{
  	
	   System.out.println(a)

	}

/*for(; a<=5 ; a--)
	{
  	
	   System.out.println(a)

	} Error Variable a is not defined. initialization is compulsory in for loop.
*/

/*
int a = 10
for(System.out.println("HELLOOO"); a<=5 ; a--)
	{
  	
	   System.out.println(a)

	} no error, it will work with writing Hellooo one time and 10 to 5 values*/

/*

int a = 10
for(int a = 10; a<=5 ; System.out.println("HELLOOO"))
	{
  	
	   System.out.println(a)
	   a--;

	} no error, it will work with writing Hellooo every time  with 10 to 5 values

*/

/*
for( ; ; )
	{
  	
	   System.out.println("a");  no error it will give Infinite loop

	}
*/
for( ; ; )
	{
  	
	   System.out.println(a);  error it will return as variable not declared 

	}
*/


}

}