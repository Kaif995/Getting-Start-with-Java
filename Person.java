package firstProject;

public class Person {

    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

