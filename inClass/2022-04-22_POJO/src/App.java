public class App {
    public static void main(String[] args) {

        // Java is an Object Oriented Language

        // Class and Object.  Classes define objects.  

       // The "root" or "super" object is called Object.class

        String s = new String("Hello");
        String t = "Goodbye";

        Person pn = new Person("Wilma", "Flintstone", 50);
        Person friend = new Person("Betty", "Rubble", 40);

        System.out.println("Person is " + pn);
        System.out.println("There friend is " + friend);
        
        // pn.lastName = "Flintstone";
        // pn.firstName = "Fred";
        // pn.height = 50;
        // friend.lastName = "Rubble";
        // friend.firstName = "Barney";
        // friend.height = 40;

        friend.setLastName("Rubble");
        friend.setFirstName("Barney");
        friend.setHeight(40);
        
        System.out.println(friend.getFullName());


        Person[] people = new Person[100];

        Object o = new Object();
        Object p = new Object();

        System.out.println(o);
        System.out.println(p);
        System.out.println(o.equals(p));

        Person stranger = new Person();
        System.out.println(stranger);
        System.out.println();


        System.out.println("Done");
    }
}
