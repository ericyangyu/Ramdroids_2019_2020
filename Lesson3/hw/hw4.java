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
		int y= 0;
		for( int start = 0; start < 3; start++, y= 0 ) {
			for(int z=0; z<3-start; z++) {
				System.out.print(" ");
				}
				while(y !=2 * start+1)
					{
					System.out.print("*");
				++y;
					}
				for(int end=0; end<3-start; end++) {
					System.out.print(" ");
				}
			
		     System.out.println();
		}    
	}
}
		   

	


