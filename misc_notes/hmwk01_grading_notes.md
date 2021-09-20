# Homework01 grading notes, Fall, 2021

## Grading method

* Programs were run in an automated script, then I checked the output of the script.
* My script commented out the "package" line from your code, if there was package code.


## File Names

Use the file Name specified.  For the first few programs the name doesn't matter because there is only one .java file.  But it will matter when there are multiple files

## Javadoc comments

Javadoc style comments are the ones that start with /**...*/ Note that Javadoc comments start with two * symbols after the /

This style of comment should ***only*** be used immediately before:

* classes
* methods 
   * Methods are functions that appear in classes.  In Java all functions must be defined in a class, so all Java functions are methods

Use the /*...*/ comment or the // style comment for comments that are inside a function.

For a public class, the Javadoc comment should appear right before the class.  This is *after* the import and package statements.

## Love for Blank Lines

Use blank lines to separate blocks of code.

## Code comes after the comments for the section

Traditionally there is a comment that explains what the code is doing, then the code appears after the comment.
## Closing the scanner

In class I neglected to close the scanner.  Really the scanner should be closed as part of the input section

## The trap

The formula was specified with 5/9 first.  This would cause integer division and would always give 0.  

### Possible solutions

#### Option 1: 

 Leave 5/9 first, but make it do floating point arithmetic

 * Make 5 or 9 or both as floating point numbers.
    * 5./9
    * 5/9.
    * 5./9.
     * (float)5/9 //This only makes the 5 a float, so it is the same as the first example)
     * ~~(float)(5/9)~~ Why wouldn't this work?

#### Option 2: Reverse the order

The original formula was $C = \frac{5}{9}(F-32)$

If the fahrenheit temperature is float, then reversing the formula works in this case. $C = (F-32)\frac{5}{9}$

#### Option 3: Change 5/9 to 0.5555555

### Option 4: Divide by 1.8


### Which option is best?

Although both options work, I think Option 1 is better than Option 2.  It fixes the problem as close as possible to where the problem actually is.  This is generally good practice in programming.

Option 2 only worked in this case because the sub-expressions were multiplied times each other.  It would not have worked if the formula involved adding the numbers.  ***Why?***

<hr>
## Common comments 

The Javadoc-style comment /** should only be used before functions and classes.  Use /* and // comments within functions



