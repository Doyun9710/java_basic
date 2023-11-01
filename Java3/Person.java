public class Person {
    private int id;
    private String name;
    private int age;

    public Person( int id, String name, int age ) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // toString() 상속 => overriding
    public String toString() {
        return "Person[id=" + id + ", name=" + name + "]";
    }

    public boolean equals( Object obj ) {
        boolean result = false;
        Person p = (Person)obj;
        if( p.id == this.id && p.name.equals(this.name) && p.age == this.age ) {
            result = true;
        }
        return result;
    }
}
