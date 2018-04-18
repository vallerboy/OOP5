package genericarray;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2 , 7, -3 };
        String[]  stringArray = { "A", "Z", "C" };
        GenericArray<String> genericArray = new GenericArray<>(stringArray);
        MinMax<String> minMax = genericArray.getMinMax();
        System.out.println(minMax.getLast());
    }
}
