package taskwithdates;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("ASD", "ASSD");
        Product product1 = new Product("ASD", "ASSD");

        Guarantee guarantee = new Guarantee(LocalDate.of(2019, 5, 5), product);
        System.out.println(guarantee.isValid());
    }
}
