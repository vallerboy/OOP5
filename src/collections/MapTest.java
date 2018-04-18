package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> tasks = new HashMap<>();
        tasks.put("10", "Zrób xyz");
        tasks.put("12", "Zrób xyzyx");
        tasks.put("15", "Odbierz dzieciaki");

        // Klucze
//        for (String s : tasks.keySet()) {
//            System.out.println(s);
//        }

        //Wartości
//        for (String s : tasks.values()) {
//            System.out.println(s);
//        }

        for (Map.Entry<String, String> stringStringEntry : tasks.entrySet()) {
            System.out.println("Klucz: " + stringStringEntry.getKey() + " wartość: " + stringStringEntry.getValue());
        }
    }
}
