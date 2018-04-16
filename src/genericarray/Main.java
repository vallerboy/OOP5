package genericarray;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2 , 7, -3 };
        String[]  stringArray = { "A", "Z", "C" };
        GenericArray<Integer> genericArray = new GenericArray<>(integerArray);
        MinMax<Integer> minMax = genericArray.getMinMax();
        System.out.println(minMax.getLast());
    }
}
