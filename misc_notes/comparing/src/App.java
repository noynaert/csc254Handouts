import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Person pn = new Person("Fred", 30);
        String[] words = { "bob", "ted", "carole", "alice" };
        System.out.println(pn);
        System.out.println("Hello, World!");
        printList(words);
        Person[] people = { pn,
                    new Person("Barney",29),
                                        new Person("Wilma",31),

                    new Person("Betty", 29)
        };
        printList(people);
        Arrays.sort(words, 0, words.length);
        printList(words);
        Arrays.sort(people, 0, words.length);
        printList(people);

    }

    public static void printList(Object[] list) {
        System.out.println("---------------");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("[%d] %s\n", i, list[i]);
        }
        System.out.println("");
    }
}
