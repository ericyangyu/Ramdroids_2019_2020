/*
    hw12

    Your job is to print a diamond to the terminal using nested while loops. 
		This should be a bit more difficult than drawing a triangle. For example:

      *  
     ***
    *****
     ***
      *


	should be printed if we want to print a diamond of height 5

	Note: if you already know what methods are, do not create any helper
	methods to draw your objects. You can only code inside the scope of
	the "main" function

	Hint: You want to implement this function by doing something similar to
	how you did hw11. This time, you want to draw a regular triangle on top of
	an inverted one. The same concepts apply in terms of spaces:

	ss*ss
	s***s
	*****
	s***s
	ss*ss

	assuming the s's represent spaces. 

	What makes this different though is you may only implement this using
	nested while loops. A skeleton of the code is given below. Can you figure
	out how to do the rest?
 */

public class hw5 {
	public static void main( String[] args ) {
		int next = 10;
		while( next == 10 ) {
			 int lines = 3, y = 0;
		        for(int i = 1; i <= lines; ++i, y = 0) {
		            for(int space = 1; space <= lines - i; ++space) {
		                System.out.print("  ");
		            }
		            while(y != 2 * i - 1) {
		                System.out.print("* ");
		                ++y;
		            }
		            System.out.println();
		        }
		        next--;
		}
			while( next== 9 ) {
				int rows = 2;
		        for(int z = rows; z >= 1; --z) {
		            for(int space = 1; space <= rows - z; ++space) {
		                System.out.print("  ");
		            }
		            for(int j=z; j <= 2 * z - 1; ++j) {
		                System.out.print("* ");
		            }
		            for(int j = 0; j < z - 1; ++j) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
			      next--;  }
			    }
	}
	
		// you may want to consider having another set of nested while loops to draw the inverted triangle
	

