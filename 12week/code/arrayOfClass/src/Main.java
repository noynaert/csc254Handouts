import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person pn = new Person("Bernadette", 28);
//        System.out.println(pn);

        final int MAX = 10;
        Person[] people = new Person[MAX];
        int n;

        n = readPeople(people, MAX);
        System.out.println("n is " + n);
        printPeople(people, n);

        selectionSort(people, n);
        printPeople(people,n);


        System.out.println("Done");
    }

    public static void swap(Person[] list, int i, int j) {
        Person temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSort(Person[] list, int n) {
        for (int i = 0; i < n - 1; i++) {
            int locationOfSmallestSoFar = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j].compareTo(list[locationOfSmallestSoFar]) < 0) {
                    locationOfSmallestSoFar = j;

                }
                swap(list, i, locationOfSmallestSoFar);
            }
        }
    }


    private static int search(Person[] people, int n, String target) {
        int foundAt = -1;
        int i = 0;
        while (i < n && foundAt < 0) {
            if (target.compareToIgnoreCase(people[i].getName()) == 0) {
                foundAt = i;
            }
            i++;
        }
        return foundAt;
    }


    public static void printPeople(Person[] people, int n) {
        System.out.printf("\nPrinting %d people\n", n);
        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }
    }

    public static int readPeople(Person[] people, int max) {
        int n = 0;
        try {
            Scanner input = new Scanner(new File("data.txt"));
            while (n < max && input.hasNextLine()) {
                String line = input.nextLine().trim();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = 0;
                    age = parse(parts[1]);
                    Person pn = new Person(name, age);
                    people[n] = pn;
                    n++;
                }
            }
            input.close();
        } catch (Exception e) {
            System.err.println("Could not read the file.  " + e.getMessage());
            System.exit(1);
        }
        return n;
    }

    public static int parse(String s) {
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (Exception e) {
            System.err.printf("Input was \"%s\" + %s", s, e.getMessage());
            System.exit(1);
        }

        return result;
    }
}
