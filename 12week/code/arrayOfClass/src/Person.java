public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public Person(){
        this("ANONYMOUS", 0);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age < 0 || age > 120) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        String result = String.format("%-10s Age: %3d", name, age);
        return result;
    }

    @Override
    public int compareTo(Person other) {
        //int result = this.getName().compareToIgnoreCase(other.getName());
        int result = this.name.compareToIgnoreCase(other.name);
        return result;
    }
}
