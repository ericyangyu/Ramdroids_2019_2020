/*
	 In this homework, you'll use if, else if, and else statements to
	 determine your power level. Fill out all TODOs. Here is the structure:
	 
	 if your power level is below 100, print out "pathetic"
	 else if your power level is 100-299, print out "heckers"
	 else if your power level is 300-799, print out "gettin powerful"
	 else if your power level is 800-2999, print out "oof"
	 else if your power level is 3000-9000, print out "youch"
	 else, print out "it's over 9000!!!"

*/

import java.io.*; // Imports libraries for us to use
import java.util.*;

public class hw2 {

	private static int power = 300;

	public static void main( String[] args ) {
		// TODO: Create your if logic here. Assume "power" is your power level.
		// hint: to check if power is 100-299, your logic is like how you say it out loud.
		// You are between 100 and 299, or in other words, greater than 100 and less than 299.
		if( power < 100 ) {
		    System.out.println( "pathetic" );
}
		else if( power >= 100 && power < 300 ) {
		    System.out.println( "heckers" );
}
		else if( power >= 300 && power < 800 ) {
			System.out.println( "getting powerful" );
}
		else if( power >= 800 && power < 3000 ) {
			System.out.println( "oof" );
}
		else if( power >= 3000 && power <= 9000 ) {
			System.out.println( "youch" );
}
		else {
		    System.out.println( "IT'S OVER 9000!!!!" );
} } }

