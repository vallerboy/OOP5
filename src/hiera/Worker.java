package hiera;

public class Worker {
    private int salary;
    private String name;

    public Worker(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Worker() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shout() {
        System.out.println("Wiecej kasy, zalozymy zwiazek pracy, hehe bojcie sie");
    }
}
