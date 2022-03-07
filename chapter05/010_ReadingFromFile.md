# 050.010 Reading from a file

## Review

To read from a keyboard we used the scanner class to read from System.in

```java
Scanner keyboard = new Scanner(System.in);
```

Scanner expects a ***stream*** of character data.  

There are a lot of possible streams:

* The keyboard is one source that may be a stream.  
* A URL may be a stream.  
* A piece of equipment may be a stream
* A local file may be a stream

The "next" system is used to read data from the file.

Data Type|Method|Comment
:---:|:---|:---
String|`input.next()`|Treats "whitespace" as a separator.  This can be good and bad.
String|`input.nextLine()`|Reads the entire line up to the \n and saves it as a String.
int|`input.nextInt()`|&nbsp;
double|`input.nextDouble()`|&nbsp;
char|---|There isn't one!

## File

A file is a named resource on your local computer or network.  In this class we will be using text files stored on a hard drive or physical media.

Java has a class for Files.  The File class is treating the File object as a generic resource.

```java 
       String fileName = "people.txt";
        File inputFile = new File(fileName);
        System.out.printf("File exists: %b\n", inputFile.exists());
        System.out.printf("File Size in bytes: %d\n", inputFile.length());
```
But you can't do input or output directly to the file!  For that we need something like a Scanner for reading the file and something like PrintWriter for output.  This seems annoying at first.  BUt it allows you to use different methods

Scanners have the potential to cause errors.  There are likely to be problems that are not under programmer control.  For example, a file may be missing.  This potential error must be "handled."

Exceptions are handled by `try{}catch(){}` blocks.  You should understand what is happening with a try...catch block, but you will not need to write one on an exam.

## Complete program

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String fileName = "people.txt";
        File inputFile = new File(fileName);
        System.out.printf("File exists: %b\n", inputFile.exists());
        System.out.printf("File Size in bytes: %d\n", inputFile.length());

        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNext()) {
                String name = input.next();
                int age = input.nextInt();
                System.out.printf("%-10s %4d\n", name, age);
            }

            //Throw away the first line
            String line = input.nextLine();
            System.out.println(line);



            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
            //e.printStackTrace();
        }
        
        System.out.println("Hello, World!");
    }
}
```