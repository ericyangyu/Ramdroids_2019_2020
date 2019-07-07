import java.util.Scanner;

/*
    hw3

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
			// TODO
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your row");
		int row = sc.nextInt();
		System.out.println("enter your column");
		int column = sc.nextInt();

		for (int i =0; i<row; i++)
		{
			for (int j = 0; j< column; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
