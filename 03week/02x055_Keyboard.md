# 02.055 Input from the Keyboard

```java
//Illustrates reading from keyboard

import java.util.Scanner;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html

public class ReadKeyboard{
    public static void main(String[] args){
        int whole;
        double x;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        whole = keyboard.nextInt();
        System.out.println("Whole number is " + whole);

        System.out.print("Enter a double: ");
        x = keyboard.nextDouble();
        System.out.println("Double is "+double);

    }
}
```
# Scanner class

[The Scanner Class API entry](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html)

Scanner reads text and converts it to other data types.

The default type is String.  Numeric types must be converted.

The default delimiter is "white space."  Adjacent white space characters are collapsed to a single character.

White space characters include:

* blank spaces
* Carriage returns
* Tabs
* Line feeds
* Generally, anything with an [ASCII]*https://theasciicode.com.ar/) value of less than 32.
* [Chart of ASCII codes](https://theasciicode.com.ar/)

The Scanner class does a lot of things Americans don't usually consider.  For example, in many countries commas are used as decimal points.  Other things like local language variations of negative number notation are also considered.

## Most important methods

### The "next..." family

* next()
* nextLine()  //Reads internal white space up to the new line character
* nextInt()
* nextDouble()
* ~~nextchar()~~  //It isn't there.  Quite an annoyance at times.

### The "hasNext..." family

* hasNext()
* hasNextLine()
* hasNextInt()
* hasNextDouble()
