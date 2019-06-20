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

public class Driver {

	// XXX Don't edit the main function XXX
	public static void main( String[] args ) {
		// Tries to take in an argument from the command line
		try {
			int power = Integer.parseInt( args[0] );
			powerLevel( power );
		} // If no argument found, throw an error
		catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println( "Need to input a number! i.e. java Driver 5" );
		} // If not a number, throw an error
		catch( NumberFormatException e ) {
			System.out.println( "Need to input a number! i.e. java Driver 5" );
		}
	}

	// Takes in a power level and prints out the appropriate message
	private static void powerLevel( int power ) {
		// TODO
	}
}
