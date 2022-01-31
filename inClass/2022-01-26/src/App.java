import java.util.Scanner;

/**
 * This program reads from the keyboard
 * 
 * 
 * @author J. Evan Noynaert
 * @since January, 2022
 */

public class App {
    public static void main(String[] args) {
        int quantity;
        double price;
        String itemName;
        double totalPrice;

        quantity = 5;
        price = 2.97;
        itemName = "Hot Dogs";
        totalPrice = quantity * price;

        System.out.println("The item is " + itemName);
        System.out.println("The total price is " + totalPrice);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many items do you want? ");
        quantity = keyboard.nextInt();

        System.out.print("What is the price of the item? ");
        price = keyboard.nextDouble();

        System.out.print("What is the name of the item? ");
        itemName = keyboard.next();

        System.out.println("Items ordered: "+ quantity);
        System.out.println("Price: " + price);
        totalPrice = price * quantity;
        System.out.println(quantity + " " + itemName + " at " + price + " totals "+
                totalPrice);

        

        keyboard.close();
        System.out.println("\nDone!");
    }
}