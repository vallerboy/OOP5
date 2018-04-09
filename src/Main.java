import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Troll troll = new Troll(1,2,2);

        Person person = new Person(20, "Adam", 180);
        Person person1 = new Person(20, "Adam", 180);


        Worker worker = new Worker("Dorota", "Polak", 3500, 53);
        System.out.println(worker.salaryOfYear());

    }
}