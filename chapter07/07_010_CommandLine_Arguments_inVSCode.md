# Command Line arguments in vs code.

# The command line

```java
public class Argie {
    public static void main (String[] args){
	     System.out.println("Hello.");
         System.out.printf("There are %d command line arguments\n", args.length);

		 //print the command line arguments
		 for(int i = 0; i<args.length; i++){
		    String arg = args[i];
		    System.out.printf("[%d] %s \n", i, arg);
		 }
    }   
}
```

## The `launch.json` file

You can create the "launch.json" file in a few different ways.  It can be created when you create the project.  But since you probably forgot, go to the "Run" menu option.  If you do not have a `launch.json` file, you may click on "Add configuration...".  If you already have a configuration you may be able to just "Open Configuration."

```json
{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Launch Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "Launch App",
            "request": "launch",
            "mainClass": "App",
            "projectName": "vs_args_7438f046",
            "args": ["First", "Second", "34"]
        }
    ]
}
```
* Find the line labeled "projectName".  Put a comma at the end of the line.
* Add the "args" line.  The command line arguments should be listed as an array of strings.