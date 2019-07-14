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
		int y = 0;
		for(int x = 0; x <= 2; x++, y = 0) {
			for(int z = 0; z <= 2 - x; z++) {	
				System.out.print(" ");
			}
			 while(y != 2 * x + 1) {
	            System.out.print("*");
	            	y++;
			 }
			 System.out.println("");
		}
		int c = 0;
		for(int a = 1; a >= 0; a--, c = 0) {
			 for(int b = 0; b <= 2 - a; b++) {	
				System.out.print(" ");
			}	
			 while(c != 2 * a + 1) {
		            System.out.print("*");
		            	c++;
			 }
			 System.out.println("");
		}
	}
}
