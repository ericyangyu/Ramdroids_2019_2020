# Lesson 1
## Introductions ##
Welcome to the Ramdroids software training. This is a series of training lessons that are not meant
to cover all the details of coding, but rather the most important bits for FTC competition in a short
amount of time. If you are interested in the finer details of coding, feel free to contact me (Eric),
learn online yourself, or major in Computer Science in college.

Thank you Nicole Martindale, Kayla Tran, and the FRC team 3647 Millenium Falcons for the inspiration
on this training course.

Before we begin, I want to say congratulations on making the team first and foremost; it is not an
easy task. If you put in the time and attack things with the right attitude, you will find this
experience to be highly rewarding. Without further ado, let's get straight into training.

## Print Statements ##
Print statements are used to display output to the terminal. They are generally the first things you
learn in any language. In java, we can print by typing ```System.out.println();```

Here is a snippet of code that will print "Hello World" to the console.
```System.out.println( "Hello World" );```
Notice how we place "Hello World" inside the parentheses of some larger code. For now, treat
"System.out.println" as a magical coding tool that takes in some input and spits it back out onto
the console. We will analyze this more as we go along.

Here are a few more examples:
```
System.out.println( "1" );
System.out.println( "2" );
System.out.println( "FTC is the best!" );
```

## Variables ##
In practically any programming language, there are variables that hold values of some data type.
We use variables so that we can store certain data and refer back to them in future operations.
Here is a list of different types of variables you can have (this is not a comprehensive list):
* ```boolean```: a data type that is either ```true``` or ```false```
* ```int```: a data type that can hold integers.
* ```double```: a data type that can hold very precise decimal values.
* ```String```: a data type that can hold letters/words/sentences. Think of it as just regular English.
               This data type is different from the rest because it's not a primitive data type
               (not a data type built into Java), but rather a class (we'll get into them later).

Here are a few examples of using variables:
```
boolean isRaining = false; // variable "isRaining" is set to the value "false"
boolean isSunny = true; // variable "isSunny" is set to the value "true"

int x = 0; // variable "x" is set to the value "0"
int date = 2019; // variable "date" is set to the value "2019"

double pi = 3.1415;
double threeFourths = 0.75;

String genericStatement = "Hello World";
String anotherOne = "Hola Mundo";
```

## Combining Print Statements with Variables ##
Did you know that we can print variables to terminal as well? We can do this by inputting our
variables into magic print tool, or "concatenating" (look up definition) variables of different types
with Strings and Strings only.

 Here are a few examples using variables we defined earlier:
 ```
 System.out.println( isRaining ); // Will print "false" to terminal
 System.out.println( date ); // Will print "2019" to terminal
 System.out.println( pi ); // Will print "3.1415" to terminal

 // Here is an example of concatenation. We are chaining a String "The value of x is " with a variable
 // x. We use + to add. Normally, adding a String to an int doesn't make sense, but the computer is
 // smart enough to realize that and convert the int variable "x" into a type String.
 System.out.println( "The value of x is " + x ); // Will print "The value of x is 0" to terminal
```
 ## Arithmetic Operations ##
 Previously, we used an operator "+" to concatenate a String with an int. However, operators can be
 used for a variety of things. Here are a few:
 * ```+```: operator to add numbers.
 * ```-```: operator to subtract numbers.
 * ```*```: operator to multiply numbers.
 * ```/```: operator to divide numbers.

 In action, operators are crucial to coding:
 ```
 int currentYear = 2019;
 int yearAmericaWasBorn = 1776;
 int americaAge = 2019 - 1776;

 System.out.println( "America is " + americaAge + " years old" ); // Prints "America is 243 years old"

 ```
 Here's something more practical to robotics:

 ```
 double pvcCircum = 5.969; // circumference of standard 1 1/2" PVC pipe
 double pi = 3.1415;

 double pvcRadius = ( pvcCircum / ( 2 * pi ) ); // Calculate radius of PVC pipe

 System.out.println( "The radius of a standard PVC pipe is " + pvcRadius );
 ```

 If you have any questions about this lesson, reach out to me (Eric).
