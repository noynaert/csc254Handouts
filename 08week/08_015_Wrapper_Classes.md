# Wrapper Classes (and an introduction to exceptions)

Every primitive data type in Java has an associated "Wrapper" class.

Primitive Type|Wrapper Class
:---:|:---
int|Integer
double|double
boolean|Boolean
char|Character

The wrapper classes may hold primitives of that type.

```java
Integer number = 7;
```

The wrapper classes serve several purposes.

* They usually contain constants like "MAX_VALUE" and "MIN_VALUE"
* They usually contain a lot of "static methods."  Static methods do not need to be called from a variable. If a method is static we usually call it with the name of the wrapper class in front of the period.
* They hold useful methods for that corresponding primitive type
* Sometimes we cannot use the primitive class.  There are "container classes" that contain other classes.  But containers cannot hold primitives.  So we assign integers to the wrapper class.

# Converting Strings to Numbers

```java
String numberIsh = "123";  //A String!
int number = Integer.parseInt(numberIsh);
```

There is a very big problem with parseInt() and parseDouble().  They don't check for errors.  If it is possible there is an error, we need to use a try...catch block

```java
String line;
int number;

System.out.print("Please type an integer. ");
line = input.nextLine().trim();
try{
    number = Integer.parseInt(line);
}catch(Exception e){
    System.err.println("You typed %s. It is not a valid integer.  I will use 0 instead.\n", line);
    number = 0;
}
```

In the above, note that line and number are declared outside the {} of the try and catch clauses.

