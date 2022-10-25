# 08.040 do{}while();

## Post-test

Do-while is a post-test loop.  This means the test is done *after* each pass through the loop.

Post-test loops will *always* make one pass through the body of the loop.

```
do{
    //some statements go here
}while(boolean expression);
```
## Syntax

* Must start with `do`
* Must include the {curly braces}
* Must have a while, and the while must have a boolean expression inside the parenthesis
* Effectively, you may always put a ; after the ).  It is usually required by other syntax.  I suggest tht you always put it in, even though it may not always be needed.

## Warning -- ! logic

The loop continues until the loop condition is true.  But we often want to stay in the loop until the condition is false.  Therefore we have to use a lot of logic that results in "not logic."  It can be tricky.  

Truth tables can be important.  But careful testing is also very important.

## Examples

### Simple get an answer
```java
        int a = (int)(Math.random() * 11);  //generates a number 0 through 10
        int b = (int)(Math.random() *11);
        int sum = a+b;

        int answer = -1;
        do{
            System.out.printf("What is the sum of %d + %d? ", a, b);
            answer = new Scanner(System.in).nextInt();
        }while(answer != sum);
        System.out.printf("%d + %d is %d\n",a, b, answer);
        System.out.println("Congratulations!");
```

### Getting Yes or No

```java
         String line;
         do{
             System.out.print(" Yes, or No?");
             /*String*/ line = new Scanner(System.in).nextLine().trim().toUpperCase(Locale.ROOT);
         } while (!line.equals("YES") && !line.equals("NO"));
```

### Getting first letter to match

```java
        char ch = '\u0000';
        do {
            System.out.print(" Yes, or No? ");
            String line = new Scanner(System.in).nextLine().trim().toUpperCase(Locale.ROOT);
            ch = line.charAt(0);
        } while (ch != 'Y' && ch != 'N');
```

### Get a number

        int answer = Integer.MAX_VALUE / 2 + 1;  //Is definitely an odd number!
        do {
            System.out.print("Type an even integer: ");
            answer = new Scanner(System.in).nextInt();
        } while (answer % 2 != 0);
    


### Get a number safely

```java
int answer = Integer.MAX_VALUE / 2 + 1;  //Is definitely an odd number!
        do {
            System.out.print("Type an even integer: ");
            String line = new Scanner(System.in).nextLine().trim();
            try {
                answer = Integer.parseInt(line);
            } catch (Exception e) {
                //Do nothing
            }
        } while (answer % 2 != 0);
```