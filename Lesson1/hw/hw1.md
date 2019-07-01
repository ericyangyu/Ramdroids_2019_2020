# Homework 1

Here are a few exercises for you to work with operators and variables

## Exercise 1
```
int x = 5999;
int y = 7000;

int z = x + y;
```
What is the value of z?
z=12999
## Exercise 2
```
int x = 700 + (500 * y);
int y = 5;

int z = x - y;
```
What is the value of z?
(This is actually a trick question, this will not compile because x calls some
 variable y, which is not defined until the next line)
z's value is unknown as y is called as a variable prior to being defined
## Exercise 3
```
int x = 500 - (800 * ( 30 / 5 ) ) / 2;
int y = 10;

int z = x * y * x * y;
```
What is the value of z?
z=361,000,000