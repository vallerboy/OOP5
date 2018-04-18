package task.from.collections;

import java.util.HashMap;
import java.util.Map;

public class CountNumber {
    public static void main(String[] args) {
        int[] ints = {1,1,1,1,1,1,1,2,2,2,2,3,3,3,3,4,5,123,2,321,412,34412,421,12,4213,21,24,2,32,3};
        Map<Integer, Integer> counts = new HashMap<>();

        //key - to jest liczba, value - to jest ilość wystąpień liczby w zbiorze
        for (int anInt : ints) {
            if(counts.containsKey(anInt)){
                counts.put(anInt, counts.get(anInt) + 1);
            }else{
                counts.put(anInt, 1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : counts.entrySet()) {
            System.out.println("Liczba " + integerIntegerEntry.getKey() + " ma " + integerIntegerEntry.getValue() + " wystąpień");
        }

        if(counts.containsKey("jakisklucz")){
            System.out.println(counts.get("jakisklucz"));
        }
    }
}
