/*
    hw9

    Your job is to print a square to the terminal using nested for loops. For example:

    *****
    *****
    *****
    *****
    *****


    should be printed if we want to print a 5x5 square.mv

    Note: if you already know what methods are, do not create any helper
    methods to draw your objects. You can only code inside the scope of
    the "main" function
 */

public class hw3 {
	public static void main( String[] args ) {
	int rows = 5, columns = 5;
	for (int x = 0;  x < rows; x++) {
		for (int y = 0; y < columns; y++) {
			System.out.print("*");
		}
			System.out.println("");
	}
	}
}