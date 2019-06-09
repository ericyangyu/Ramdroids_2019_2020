# Lesson 3

## System.out.print vs System.out.println ##
This entire time, we have been using System.out.println() to print out lines of Strings; "print" means
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

