/*
    hw11

    Your job is to print a triangle to the terminal using nested for loops. 
	This should be a bit more difficult than drawing a square. For example:

      *  
     *** 
    *****


	should be printed if we want to print a triangle of height 3.

	Note: if you already know what methods are, do not create any helper
	methods to draw your objects. You can only code inside the scope of
	the "main" function

	Hint: You want to implement this function by doing something similar to
	how you draw a square. A triangle really just looks like a square, except
	any space that should be white space instead of "*" is just replaced with
	a literal space character. For example, the triangle example we see above
	can also be represented as:

	ss*ss
	s***s
	*****

	assuming the s's represent spaces. Can you figure out how to do that? 
	You may need to do some math!
 */

public class hw4 {
	public static void main( String[] args ) {
			// TODO
		for( int i = 1; i < 2; i++ ) {

		    System.out.println( "   *  ");

		    for( int n = 1; n < 2; n++ ) {
		        System.out.println( "  *** " );
		        System.out.println( " ***** "  );
		    }

		    System.out.println();
	}
}}
