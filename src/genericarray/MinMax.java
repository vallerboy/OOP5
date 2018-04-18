package genericarray;

import java.util.Collection;
import java.util.List;

public class MinMax<T> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;

    String  s = "asd";
    }



    public T getFirst(){
        return array[0];
    }

    public T getLast(){
        return array[array.length - 1];
    }
}
