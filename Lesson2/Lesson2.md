# Lesson 2
## Conditional Statements ##
Conditional statements are checks to see if some condition has been met before some action is taken.

Here is how it works logically:
```
If there are gray clouds in the sky, it is going to rain.
```

Inverting this logic yields:
```
If there are no gray clouds in the sky, it is not going to rain.
```

Here is a sample snippet of Java code that is logically equivalent:
```
boolean grayCloudsExist = true;

if( grayCloudsExist == true ) {
    System.out.println( "It is going to rain." );
}
```

Now what is going on here? Well, "if statements" are structured similarly to "System.out.println" in that
they take in inputs; in this case, the inputs are conditions. Conditional operators like ```==```
return either ```true``` or ```false```, and essentially replace your condition with a boolean.
The input in this case is:
```
if grayCloudsExist equals true, print "It is going to rain."
```

## If-Else Statements ##
Here is a snippet of code that appends to what we had earlier:
```
boolean grayCloudsExist = true;

if( grayCloudsExist == true ) {
    System.out.println( "It is going to rain." );
}
else {
    System.out.println( "It is not going to rain." );
}
```

The equivalent of this is:
```
if grayCloudsExist equals true, print "It is going to rain.". Else, print "It is not going to rain.".
```

Now what makes this series of conditions unique is that if one of them pass, the rest of the conditions
will not execute. For example, if the "grayCloudsExist == true" condition passes, then we skip the
"else" condition.

## If-ElseIf-Else Statements ##
Here is an example of another series of if statements:
```
int age = 18;

if( age < 18 ) {
    System.out.println( "You are under 18 and not allowed to vote." );
}
else if( age == 18 ) {
    System.out.println( "You are 18 and allowed to vote." );
}
else {
    System.out.println( "You are over 18 and allowed to vote." );
}
```

The same logic applies here as in the If-Else, in the sense that if one condition passes, all the other
ones will be skipped. For example, in the example above, "You are 18 and allowed to vote" will be printed.

How this works is that we check if ```age < 18```. Since this is clearly false, we then check if
```age == 18```. Age is equal to 18, so we enter the "body", or the code surrounded by the ```{``` and
```}```. The body is the code that acts as a paragraph, and runs only if the condition it belongs to
is satisfied.

If age was 19, then this "else if" condition would not be satisfied since 19 doesn't equal 18. Thus,
```else``` catches all conditions that don't meet the previous ones, so we'll enter the code body of
the else condition. "You are over 18 and allowed to vote." will be printed in this case.

## Exercise 1 ##
```
int grade = 11;

if( grade == 9 ) {
    System.out.println( "You are a freshman." );
}
else if( grade == 10 ) {
    System.out.println( "You are a sophomore." );
}
else if( grade == 11 ) {
    System.out.println( "You are a junior;" );
}
else if( grade == 12 ) {
    System.out.println( "You are a senior." );
}
else {
    System.out.println( "You are not in high school." );
}
```
What gets printed out?

You are a junior 
## Exercise 2 ##
```
int x = 100;
int y = 250;
int g = x * y;
int z = ( x + ( g / x ) ) / 2

if( z > 175 ) {
    System.out.println( "1" );
}
else if( z < 175 ) {
    System.out.println( "2" );
}
else {
    System.out.println( "3" );
}
```
What gets printed out?
3
## Switch Statements ##
Sometimes, if you have a lot of conditions to check for, if statements aren't the most efficient. Java
has provided a framework for you!

Here is an example of what we call a "switch statement":
```
int grade = 11;

switch( grade ) {
    case 9:
        System.out.println( "You are a freshman." );
        break;
    case 10:
        System.out.println( "You are a sophomore." );
        break;
    case 11:
        System.out.println( "You are a junior;" );
        break;
    case 12:
        System.out.println( "You are a senior." );
        break;
    default:
        System.out.println( "You are not in high school." );
}
```

The snippet above has the exact same logic as Exercise 1. What's going on is we have a conditional
method called "switch" that takes in some variable as input. Each case is like an if or else-if
condition, and will only return ```true``` if grade is equal to the value next to case. The code
indented under each case is considered the body of each case, just like how each if condition has a
body.

Note: Switch statements are not great for comparisons, such as in Exercise 2. They are only good
for seeing if some variable is equal to some value.

## Logical Operators ##
You have already seen some logical operators in action like ```==``` and ```<```. Here is a more
detailed list of such operators (not a comprehensive list):
* ```==``` Equals operator: Checks if two values are the same
* ```!``` Not operator: Inverts the value of a comparison. For example, != means "Not equals"
* ```>``` Greater than operator: Checks if left value is greater than right value
* ```<``` Less than operator: Checks if right value is greater than left value
* ```>=``` Greater than or equal to operator: Checks if left value is greater than or equal to the right value
* ```<=``` Less than or equal to operator: Checks if the left value is less than or equal to the right value
* ```&&``` And operator: Links two conditions and returns true only if both conditions are satisfied
* ```||``` Or operator: Links two conditions and returns true if either or both conditions are satisfied

## Exercise 3 ##
```
boolean americanCitizen = true;
int age = 16;

if( americanCitizen == true && age >= 18 ) {
    System.out.println( "You can vote. Woo!" );
}
else if( americanCitizen == false && age >= ) {
    System.out.println( "You can't vote." );
}
else if( americanCitizen == false || age == 16 ) {
    System.out.println( "You can vote, even though you aren't allowed to since you're not a citizen" );
}
```
Note: ```else``` condition is optional.

What gets printed?
You can't vote. 
If you have any questions, please ask your friends or Eric.