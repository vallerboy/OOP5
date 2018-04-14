package hiera;

public interface Management {
    void kickOut(String name);

    default void test() {
        System.out.println("Hello");
    }
}
