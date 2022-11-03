# some scratch files used in lecture
## try()
```java
/**
     * This function pauses for 1.5 to 3.5 seconds while the computer "thinks."
     */
    private static void think() {
        System.out.println("\nLet me think...");
        long milliseconds = (long)(Math.random() * 1000. + 1500);
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            //Do nothing
        }
    }
```
## drawmatches()
```java
/**
     * This function prints a given number of symbols. The symbols are broken into groups of 5.
     *
     * @param matches The number of symbols to be printed
     * @param symbol  The character to be printed.
     */
    private static void drawMatches(int matches, String symbol) {
        final char SPACE = '\u00A0';  // This is the "hard space" or "non-breaking space"

        for (int i = 0; i < matches; i++) {
            System.out.print(symbol);
            if ((i) % 5 == 4) {
                System.out.print(SPACE);
            }
        }
        System.out.println();  // Put the display on its own line.
    }
```