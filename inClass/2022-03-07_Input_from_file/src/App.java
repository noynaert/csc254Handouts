import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // must specify the stream we will read from.

        String fileName = "data.txt";
        File inputFile = new File(fileName);

        System.out.printf("The file %s exists: %b\n", fileName, inputFile.exists());
        System.out.printf("The file length is %d bytes\n", inputFile.length());

        try {
            Scanner input = new Scanner(inputFile);
            String s = input.nextLine(); // Read the first line
            //System.out.println(s);

            //Print header on table
            System.out.println("\n\nName     Age");

            //Read and print the data
            while (input.hasNext()) {
                String name = input.next();
                int age = input.nextInt();
                System.out.printf("%-8s %3d\n", name, age);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR:  Could not open the file " + fileName);
            System.err.println(e.getMessage());
            System.exit(1);
            // TODO Auto-generated catch block
            // e.printStackTrace();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            System.err.println("\t " + e.getMessage());
            System.exit(1);
        }

        String first = "Fred";
        String last = "Flintstone";
        String name = last + ", " + first;
        System.out.println(name);

        System.out.println(" 🤫   \u263A");
    }
}
