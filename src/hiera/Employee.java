package hiera;

public abstract class Employee {
    private String lastname;

    public Employee(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public abstract void shout();
}
