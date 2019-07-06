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
		int i = 0;
		while(i < 1) {
			System.out.println("   * ");
			System.out.println("  *** ");
			System.out.println(" ***** ");
			i++;
			while(i < 2 ) {
				System.out.println("  *** ");
				System.out.println("   * ");
				i++;
			}
		}
		// you may want to consider having another set of nested while loops to draw the inverted triangle
	}
}
