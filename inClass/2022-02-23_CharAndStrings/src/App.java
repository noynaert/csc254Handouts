public class App {
    public static void main(String[] args) throws Exception {
        //char symbol1 = 'A';
        //char symbol1 = 65;
        //char symbol1 = 0x41;
        char symbol1 = '\u0041';
        System.out.printf("%c has a decimal value of %d and a hex value of 0x%x\n", symbol1, (int) symbol1, (int)symbol1);
        
        //char symbol2 = '⪰';
        //char symbol2 = 0x2ab0;
        char symbol2 = '\u2ab0';
        System.out.printf("%c has a decimal value of %d and a hex value of 0x%x\n", symbol2, (int) symbol2,
                (int) symbol2);


        String sentence = "I found the math symbol \u2ab0";
        System.out.println(sentence);
        System.out.println("!");

        String combined = "The 👨‍🍳 symbol is a combination of \"Man\" with the symbol for \"Cooking\"";
        System.out.println("How do you print the \\ symbol?");
        System.out.println("The file is at C:\\users\noynaert");
        System.out.println(combined);

        String single = "x";
        symbol2 = single.charAt(0);
        System.out.printf("%c has a decimal value of %d and a hex value of 0x%x\n", symbol2, (int) symbol2,
                (int) symbol2);

        if (single.compareTo("a") ==0) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
       }

    } 
}
