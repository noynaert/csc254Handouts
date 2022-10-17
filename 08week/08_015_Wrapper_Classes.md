# Wrapper Classes

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
* Sometimes we cannot use the primitive class.  There are "container classes" that contain other classes.  But containers cannot hold primitives.  So we assign integers to the wrapper class.
