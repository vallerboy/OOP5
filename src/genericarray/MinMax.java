package genericarray;

public class MinMax<T> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getFirst(){
        return array[0];
    }

    public T getLast(){
        return array[array.length - 1];
    }
}
