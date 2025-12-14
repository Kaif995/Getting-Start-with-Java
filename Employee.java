package firstProject;

public class Employee extends Person {

    protected String office;
    protected double salary;
    protected String dateHired;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

