package generic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Entry<Integer> entry = new Entry<>(5);
        Entry<String> entry1 = new Entry<>("Ala ma kota");


        System.out.println(entry.getData());
        System.out.println(entry1.getData());

        Pair<Integer, Integer> pairs = new Pair<>(5, 5);

        //tada
        System.out.println(pairs.getFirst());
        System.out.println(pairs.getLast());





        System.out.println(hejo(1, "1"));
    }

    public static <K> Integer hejo(K test, K test1) {
        return (Integer) test  + (Integer) test1;
    }

    public static <T> String[] convert(T[] arrayToConvert){
        String[] converted = new String[arrayToConvert.length];
        for (int i = 0; i < arrayToConvert.length; i++) {
            converted[i] = arrayToConvert[i].toString();
        }
        return converted;
    }
}
