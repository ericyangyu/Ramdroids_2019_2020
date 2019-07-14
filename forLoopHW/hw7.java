/*
	Goal: Print out in reverse the int array given to you with a for loop 
				(no hardcoding!)
*/

public class hw7 {
	public static void main( String[] args ) {
		// Use a for loop to print out each element of arr backwards to terminal. 
		// No hardcoding, and either add a space after each print or go to a new 
		// line
		// Output should look like: 5 4 3 2 1

		// or 

		// 5
		// 4
		// 3
		// 2
		// 1
		int[] arr = { 1, 2, 3, 4, 5 };
		int x= 6 ;
	    int y = 4;
			while (x>1) {
	            System.out.print(" " + arr[y]);
	            x--;
	            y--;
		}
	}
}

