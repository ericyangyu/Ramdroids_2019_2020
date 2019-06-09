# Lesson 3

## System.out.print vs System.out.println ##
This entire time, we have been using System.out.println() to print out lines of Strings; "println" means
"print line". However, there also exists a System.out.print(), which basically does what "println" does
without moving to the next line once everything gets printed.

For example:
```
System.out.println( "1" );
System.out.println( "2" );
```
will print
```
1
2
```

Whereas
```
System.out.print( "1" );
System.out.print( "2" );
```
will print
```
12
```

To simulate a "println" with "print", we can add a ```new line character```, or ```\n``` to the end
of each String that we pass into "print". For example,
```
System.out.print( "1\n" );
System.out.print( "2\n" );
```
will print
```
1
2
```
which is the equivalent of the "println" statements we had earlier.

## For Loop ##
For loops are exactly what they sound like: loops that go for however long you specify. The format
of for loops is as follows:
```
for( variable; condition; increment ) {
    for loop body
}
```
The variable is where we can initialize some variable to a value. The condition checks to see if we
should enter the loop. The increment happens only once we reach the closing parenthesis, or in other
words, when we finish running the for loop body. The increment essentially increments the variable.
To loop, we then would check the condition again, and if it's satisfied we enter the loop body again,
and repeat the cycle.

Here's an example:
```
for( int i = 0; i < 5; i = i + 1 ) {
    System.out.println( "i is " + i );
}
```
would print out
```
i is 0
i is 1
i is 2
i is 3
i is 4
```
This is because some variable i is initialized to 0, then we check if 0 < 5. This is replaced with
```true```, so we enter the body. In this case, the body is just a print statement, so we finish
printing. Then, we increment i. i is now 1. Then, we check, 1 < 5 is true, so we execute the body
again. Then we increment i to 2. Then we go into the condition again. We keep doing this until
i is 5, which then 5 < 5 returns false. Then we exit the loop.

Sound intuitive? You'll get used to it.

Quick note: ```i = i + 1``` is the same as saying ```i++```, or what we know as "post-increment".
I won't be getting too much into detail about i++ vs ++i (if you're interested, feel free to look
it up), but I would just recommend not doing something like ```int x = i++;``` because that will
confused you. Just be a normal programmer and do ```i++;``` before you do ```int x = i``` because
there is a difference between ```int x = i++``` and ```int x = ++i```.

## Exercise 1 ##
```
for( int i = 0; i < 10; i++ ) {
    System.out.print( i );
    System.out.print( "\n" );
}
```
What does this print?

## Exercise 2 ##
Note: % is the modulus operator. It basically calculates the remainder of a number divided by another
number. Here's some examples:
1 % 2 = 1
2 % 2 = 0
3 % 2 = 1
4 % 2 = 0
5 % 2 = 1
107 % 2 = 1
107 % 100 = 7
207 % 100 = 7
199 % 100 = 99

It's good for calculating something... Can you figure it out?

```
for( int i = 0; i < 20; i++ ) {
    if( i % 2 ) {
        System.out.print( i );
        System.out.println();
    }
}
```
What does this print?

## While Loop ##
Here is another type of looping construct. "While" does something so long as some input condition is true.
It is similar to a for loop.

Here's an example of a while loop:
```
int i = 0;
while( i != 5 ) {
    System.out.println( i );
    i++;
}
```
prints
```
0
1
2
3
4
```

This is the exact same logic as:
```
for( int i = 0; i < 5; i++ ) {
    System.out.println( i );
}
```

How we read the above while loop is start with the condition. If i doesn't equal 5, enter the while
loop body. Once you finish incrementing i, you come back to the condition and check if it's true. If
it is, you enter the body again and repeat the cycle. The cycle is only broken once the condition
returns false.

Now you have to be careful when working with any loops, because you may get stuck in an infinite loop!
Tell me what's wrong in this loop:
```
int i = 0;
while( i != 5 ) {
    System.out.println( i );
}
```

If you haven't guessed, the output will be
```
0
0
0
0
0
0
0
... (infinite amount of 0's, or until your program crashes.)
```

We never increment i, so i is never equal to 5! You will run into this a lot as a coder going forward,
especially when code starts getting more and more sophisticated; thus, it's important to create base
cases for breaking out of loops.

## Nested For Loops ##
If you didn't like how compact for loops were before, they're about to get a whole lot more sophisticated.
Nested for loops are essentially for loops inside for loops. Now this usually gets a lot of my students
that I teach in college, but there's a trick to visualizing this.

Here is a basic nested for loop:
```
for( int i = 0; i < 2; i++ ) {

    System.out.println( "i = " + i );

    for( int j = 0; j < 3; j++ ) {
        System.out.println( "j = " + j );
    }

    System.out.println(); // Skip a line

}
```
The output is:
```
i = 0
j = 0
j = 1
j = 2

i = 1
j = 0
j = 1
j = 2

i = 2
j = 0
j = 1
j = 2
```

See a pattern? For every loop of i, we perform an entire for-loop for j. Nesting even more for-loops
will just do more of the pattern we see above. Now why would anyone do this you say?

This is exactly how we can work with multi-dimensional objects. For example, let's say you have a
2D picture that is 200x300 pixels. How can we iterate through each and every pixel?

Well, we know that it has 200 rows, and 300 columns per row. Thus, what we could do is say
"for every row in the 200 rows, iterate through 300 columns"

In code, this looks like:
```
for( int rows = 0; rows < 200; rows++ ) {
    for( int cols = 0; cols < 300; cols++ ){
        System.out.println( "Performing operation on row = " + rows + " and col = " + cols );
    }
}
```

Yes, this is exactly how digital photo filtering is like! If you would like to learn more about
nested for loop constructs and their uses, feel free to chat with me (Eric).

This concludes Lesson 3.