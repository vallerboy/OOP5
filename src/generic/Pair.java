package generic;

public class Pair<X, T> {
    private X first;
    private T last;

    public Pair(X first, T last) {
        this.first = first;
        this.last = last;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }
}
