//Person is in the POJO pattern.
// Plain Old Java Object
// POJO is almost the same thing as a "Java Bean"

public class Person extends Object {
    private String lastName;
    private String firstName;
    private int height; //centimeters
    
    public Person(String firstName, String lastName, int height) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
    }

    public Person() {
        this("Anonymous", "Coward", -45);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeight(int height) {
        this.height = (height>0) ? height : 0;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getHeight() {
        return height;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }
    

    //toString() does not do System.out.println.
    //Normally there should NOT be a \n at the end of the string that is returned
    @Override
    public String toString() {
        String result = String.format("%s %s who is %dcm tall", firstName, lastName, height);
        return result;
    }
}
