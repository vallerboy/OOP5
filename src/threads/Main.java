package threads;

public class Main {
    public static void main(String[] args) {

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Zadanie 1 - " + System.currentTimeMillis());
                    Thread.yield();
                }

            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Zadanie 2 - " + System.currentTimeMillis());
                    Thread.yield();
                }

            }
        };

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();

        System.out.println("Jestem bo oddycham");
    }
}
