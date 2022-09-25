import java.util.Scanner;

/**
 * Demonstrates booleans
 *
 * If the room is cleaned and the dishes are washed or the lawn is mowed, then
 * get $10
 *
 */
public class Chores {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean dishes; // true if dishes are washed
        boolean room; // true if room is cleaned
        boolean lawn; // true if lawn mowed
        boolean gets10dollars; // true

        // get input
        System.out.print("Were the dishes washed? (type true or false) ");
        room = keyboard.nextBoolean();
        System.out.print("Was the room cleaned? (type true or false) ");
        dishes = keyboard.nextBoolean();
        System.out.print("Was the yard mowed? (type true or false) ");
        lawn = keyboard.nextBoolean();
        // echo print
        System.out.printf("\tThe dishes were washed: %B\n", room);
        System.out.printf("\tThe room was cleaned: %B\n", dishes);
        System.out.printf("\tThe lawn was mowed: %B\n", lawn);

        // calculate
        gets10dollars = room && dishes || lawn;

        // report
        System.out.printf("%B && %B || %B gives %B\n", room, dishes, lawn, gets10dollars);

        System.out.println("\nDone!");
    }
}
