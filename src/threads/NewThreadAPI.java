package threads;

import java.util.concurrent.*;

public class NewThreadAPI {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        NewThreadAPI threadAPI = new NewThreadAPI();
        // Wątek 1
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    threadAPI.startSomething();
                }

            }
        });

        // Wątek 2
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    threadAPI.startSomethingElse();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


    }

    public  synchronized void startSomething(){
            System.out.println("HEY!");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void startSomethingElse() {
            //notify();
    }
}
