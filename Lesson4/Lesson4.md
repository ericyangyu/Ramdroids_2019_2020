# Lesson 4

## Methods ##
Methods, also known as functions, are like the functions you have in math. Think of something like
```
f(x) = x + 1
```
What do you think the function above does?

Well, it takes in some input ```x``` and increments it! Java methods are similar in that they
follow a certain format, or method signature as we call it:
```
[Return Type] [Method Name]( [input] ) {
    [Method Body]
    [Return if Return Type is not void]
}
```

What did we just do? Well, let's analyze it. We can define a method with a method name, just like "f"
is a method name for f(x). The "(x)" in f(x) is like input, which is what you pass into for your
method "f". The only new thing is the return type, which specifies what type of value you want to return
from your function. Let's analyze that more in a second.

Here's an example method:
```
void printName() {
    System.out.println( "My name is Eric." );
}
```

In this case, our "method signature" is ```void printName()```, in which we have a method called
```printName``` that takes in no input, and returns ```void``` (which means "nothing"). Our method
body is the print statement.

In fact, did you know that the print statements that we've assumed as "magic tools" are methods all
along? They are built-in functions in the java framework. The method name is "println", and it takes
in a String or any "primitive" data type values like int or float, and outputs the input to console.
The return type is void.

Now let's analyze a function with a return type:
```
int squareNumber( int x ) {
    x = x * x;
    return x;
}
```

We have a method signature ```int squareNumber( int x )````, which has method name ```squareNumber```
that takes in some int ```x```, and returns a value of type ```int```.

Notice how in our body, we save x equal to x times itself. This is essentially squaring it. Then,
we "return" the variable, or basically pass back the value of x to wherever "called" the function.

When I say "calling" a function, I just mean using the function. Whenever you do ```System.out.println()```,
you are actually "calling" the function built into Java. Since println returns nothing, you never have to
save the return value into anything. However, when you do have a return type, you would typically want
to save it into something.

For example:
```
int squareNumber( int x ) {
    x = x * x;
    return x;
}

void mainProgram() {
    int y = 5;
    y = squareNumber( y );
    System.out.println( "y is now " + y );
}
```

This will output:
```
y is now 25
```

Notice how y was 5 before, but now it's updated to 25. That's because we call squareNumber, passing in
5 as input. int x is then set to 5, and we do x = 5 * 5. We know that x = 25, and return x is
equivalent to ```return 25;```. y is then set to 25.

Methods are some of the most crucial constructs to programming. They assist us in writing more
readable code. For example, we don't have to write ```x = x * x;``` every time we want to square
a number; we can just call the helper function ```squareNumber```. If you've ever heard of Java
libraries, they are just archives of helper functions for you to use that someone else wrote already.

You have to be careful with return values, however. If the value you return does not match
the return type, then your program will not compile.

For example:
```
int squareNumber( int x ) {
    x = x * x;
    return 55.555;
}
```

What's wrong with this? Well, you specify a return type of int, but you try to return a type double.
This will not compile.

## Scope ##
There is this idea of scoping in almost all programming languages. Basically, if some variable is defined
inside some body, it will cease to exist once you exit that body. This is especially important when you
have bodies that are nested in bodies (remember nested for loops?).

Here's an example:
```
void test() {
    int x = 0; // x is a variable defined outside of the while loop, so it will exist both in the while loop and outside of it

    while( x == 0 ) {
        int j = 5;
        System.out.println( "j is " + j ); // j is defined inside the while loop, so we are still in scope
        System.out.println( "x is " + x ); // x is defined outside
        x++;
    } // After exiting this while loop, j is deallocated, and will cease to exist

    System.out.println( "x is " + x ); // We are still in scope for x
    // System.out.println( "j is " + j ); will not work
} // x goes out of scope, so x will cease to exist once we exit this method.
```

Scoping is useful because it helps keep our namespace from cluttering. If we define some variable "x"
and it never went out of scope, then we would never be able to define a variable "x" again without
messing with our previous values. That would mean trouble. Once we go out of scope, it's like
clearing up your workstation so you can use some variable "x" again.

## Local Variables ##
Variables that go out of scope once you finish some code body are called ```local variables```. They
are essentially temporary variables that you want to deallocate once you're done doing whatever
you're doing. In this case, j and x were both local variables in the example above.

## Global Variables ##
Global variables are variables that do not go out of scope even after you finish a function. In short,
they are defined outside of a function. As a result, they exist even after you finish a function, but
you can still call them within your functions.

Here's an example of a global variable:
```
int x = 5;

void squareNumber() {
    x = x * x;
}

void mainProgram() {
    squareNumber();
    System.out.println( "x is " + x );
}
```

If we called ```mainProgram()```, the output would be
```
x is 25
```

In this case, x was our global variable.