
import java.util.Scanner; 
class pattern { 
	public static void main(String[] args) 
	{ 
		
		for (int i = 1; i <= 6; i++) { 

			// loop to print the number of spaces before the star 
			for (int j = 6; j >= i; j--) { 
				System.out.print(" "); 
			} 

			// loop to print the number of stars in each row 
			for (int j = 1; j <= i; j++) { 
				System.out.print("* "); 
			} 

			// for new line after printing each row 
			System.out.println(); 
		} 
	} 
} 

	j--
i = 1	j = 6	6>=1 		_ _ _ _ _ _*_
	j = 5	5>=1    
	j = 4   4>=1
	j = 3	3>=1
	J = 2	2>=1
	j = 1	1>=1
	j = 0	False exit
	
	j++
	j = 1   1<=1  true
	j = 2