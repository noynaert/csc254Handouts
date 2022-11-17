import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String fileName = "people.txt";
            final int MAX = 10;
            Person[] people = new Person[MAX];
            int n = 0;
        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));
            while(input.hasNextLine() && n < MAX){
                String line = input.nextLine();
                String[] parts = line.split(":");
                if(parts.length == 2){
                    String name = parts[0].trim();
                    int age = getInt(parts[1]);
                    Person person = new Person(name, age);
                    people[n] = person;
                    n++;
                }else{
                    people[n++] = new Person();
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        printPeople(people,n);
        System.out.println("Done!");
    }
    public static int getInt(String s){
        s = s.trim();
        int number = Integer.MIN_VALUE;
        try{
            number = Integer.parseInt(s);
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.exit(2);
        }
        return number;
    }
    public static void printPeople(Person[] people, int n){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(int i = 0; i<n; i++){
            //System.out.println(people[i]);
            System.out.printf("%2d. %-15s %3d\n",i, people[i].getName(),people[i].getAge());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
