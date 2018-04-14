package generic;

public class Entry<X /* Integer */> {
    private X data;

    public Entry(X data) {
        this.data = data;
    }

    public X getData() {
        return data;
    }

}
