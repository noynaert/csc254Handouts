public class Person extends Object{
    private String name;
    private int age;
//scope   method signatures
    //constuctor
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public Person(){
        this("Anonymous", 0);
    }
    public Person(String name){
        this(name, 0);
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
        if(age < 0){
            this.age = 0;
        }
        if(age > 120){
            this.age = 120;
        }
    }
    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override   //decoration
    public String toString(){
        String s = String.format("Name: %s, Age: %d", name, age);
        return s;
    }
}
