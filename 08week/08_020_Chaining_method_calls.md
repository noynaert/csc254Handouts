# 02.020 Chaining methods

## The String and Character APIs.

* [The String API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)
* [The Character API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html)

## It is important to pay attention to the data types

* Data type of the argument
* Data type the method returns
* Data type of the class that is calling the method

A lot of the focus on this unit is on the data type of the method.

```Java

String word = "     catterful   "
character ch;
ch = word.charAt(0);
ch = word.charAt( word.length() -1);
ch = "rentatter".charAt(0);
ch = word.charAt(0).toUpperCase();
System.out.printf("The letter is '%c'\n",ch);
```

## Scanners:  `next()` 

The Scanner class is inconsistent with how it names methods.

* `nextInt()` returns an int
* `nextDouble()` returns a double
* `nextBoolean()` returns a boolean
* `next()` returns a String.
* nextChar IS MISSING!  There is no nextChar method.  
```java 

If you want ~~nextChar()~~ you have to do the following:

```java
char ch; 
ch = input.next().charAt(0);
ch = input.next().charAt(0).toLowerCase()

```

## `nextLine()`

The `nextLine()` method returns an entire line.

It strips off the \n at the end.

Sometimes we want to read an entire line, not just a single word.

Sometimes it is used to "flush" the rest of the line if we only want the first word or two.

```java
String word = input.next();
String sentence = input.nextLine();
```

## `trim()`

"Whitespace" refers to any character with an ASCII code of 32 or less (32 decimal '\u0020') in Unicode.  It includes the space bar, Carriage Return, LineFeed, and Tab.


The `trim()` method removes both leading and trailing whitespace from a string.  If there is no whitespace, then nothing happens.  Internal whitespace is not touched.

The `trim()` method is often chained with nextLine().

```java
String sentence = input.nextLine().trim();
```

Trimming a string with all whitespace results in an empty string.

Question:  Why don't we need to trim() input collected with `next()`?