public class App {
    public static void main(String[] args){
        String s = "Peter Piper picked      a peck of pickled peppers";
        String[] words = s.split(" +");
        int n = words.length;
        boolean found = s.contains("pock");
        System.out.println("The string contains 'pock' " + found);

        searchAll(words, "p", n);
        int foundAt = search(words, "pic", n);
        System.out.printf("FoundAt is %d", foundAt);

        System.out.println("Done!");
    }

    private static int search(String[] words, String needle, int n) {
        int foundAt = -1;
        boolean found = false;
        // 
        int i = 0;
        while (!found && i < n) {
            if (words[i].contains(needle)) {
                found = true;
                foundAt = i;
            }
            i++;
        }
        return foundAt;
    }

    private static void searchAll(String[] haystack, String needle, int n) {
        for (int i = 0; i < n; i++) {
            if (haystack[i].contains(needle)) {
                System.out.printf("Found %s in position %d.  The word is %s\n", needle, i, haystack[i]);
            }
        }
    }
}
