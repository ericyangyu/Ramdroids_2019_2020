import java.util.*;

/*
	In this homework I want you to practice debugging your code.

	Goal: Debug all the errors in the code by reading the stack trace.

*/

public class debugPrac1 {

	public static void main( String[] args ) {
		// Goal: Add two ints and print to terminal

		int x = 0
		int y = 10;

		System.out.prinln( "x + y is " + x + y );

		// Goal: split a string

		// Initialize my initial string to split
		String quote == "This is a sentence."; 

		String[] splitQuote = new String[3]

		// String.split is a function that takes in a delimiter in the form of a
		// regex pattern (don't worry what it is). In this case, my delimiter is
		// a space. Therefore, I'm splitting some string at each space and storing
		// the substrings in some string array splitQuote

		// splitQuote is supposed to look like:
		// { "This", "is", "a", "sentence." }
		splitQuote = quote.split( "\\ " );

		// Print out each element in splitQuote
		for( int i = 0; i < splitQuote.length + 1; i-- ) {
			System.out.println( quote[i] );
		}

		// Should I return anything?
		return 123;

	}
}

