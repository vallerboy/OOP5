package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Person> stringSet = new HashSet<>();


        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringSet.add(new Person("Oskar", 30));
        }
        long stop = System.currentTimeMillis();

        System.out.println(stop - start);
        System.out.println("Size set: " + stringSet.size());
    }

}
