class Pattern7{
public static void main(String argc[])
	{
	  
	for (int i = 6 - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}


}