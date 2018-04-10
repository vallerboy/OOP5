package company;

public class Worker {
    private String name;
    private String lastname;
    private int salary;
    private int age;

    public Worker(String name, String lastname, int salary, int age) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int salaryOfYear() {
        return salary * 12;
    }
}
