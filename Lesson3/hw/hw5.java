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

public class hw12 {
	public static void main( String[] args ) {
		int x = 0;
		while( x = 0 ) {
			 int rows = 5, k = 0;
		        for(int i = 1; i <= rows; ++i, k = 0) {
		            for(int space = 1; space <= rows - i; ++space) {
		                System.out.print("  ");
		            }
		            while(k != 2 * i - 1) {
		                System.out.print("*");
		                ++k;
		            }
		            System.out.println();
		        x=1;
			while( x==1 ) {
				int rows2 = 5, k = 0, count = 0, count1 = 0;
		        for(int i = 1; i <= rows2; ++i) {
		            for(int space = 1; space <= rows2 - i; ++space) {
		                System.out.print("  ");
		                ++count;
		            }
		            while(k != 2 * i - 1) {
		                if (count <= rows2 - 1) {
		                    System.out.print((i + k) + " ");
		                    ++count;
		                }
		                else {
		                    ++count1;
		                    System.out.print((i + k - 2 * count1) + " ");
		                }
		                ++k;
		            }
		            count1 = count = k = 0;
		            System.out.println();
		        }
		    }

			}
		}
		// you may want to consider having another set of nested while loops to draw the inverted triangle
	}
}
