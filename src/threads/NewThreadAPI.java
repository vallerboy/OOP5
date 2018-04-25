package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class NewThreadAPI {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        NewThreadAPI threadAPI = new NewThreadAPI();
        // Wątek 1
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                threadAPI.startListingToPlayers();
            }
        });

        // Wątek 2
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                threadAPI.playing();
            }
        });


    }

    List<String> players = new ArrayList<>();
    boolean isGameStarted = false;

    public  synchronized void startListingToPlayers(){
        players.add("Oskar");
        players.add("Damian");
        players.add("Dominika");
        System.out.println("Nasłuchuje na graczy");
        //Nasłuchiwanie skończone (gra się zaczyna)
        //Nie potrzebuje nasłuchiwać
        try {
            isGameStarted = true;
            notify();
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void playing(){
        if(!isGameStarted) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("GRAMYYYY!");
        //jakas logika gry
        //gra sie konczy
        notify();
        isGameStarted = false;
    }


}