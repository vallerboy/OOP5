package memtask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {

    private Scanner scanner;
    private Mem[] memArray;

    public Menu(){
        memArray = new Mem[5];
        scanner = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("Witaj w Memowni 2.0");

        String answer;
        do{
            System.out.print("Twój wybór: ");
            answer = scanner.nextLine();
            validateAnswer(answer);
        }while (!answer.equalsIgnoreCase("exit"));


    }

    private void addMemToArray(Mem mem){
        for (int i = 0; i < memArray.length; i++) {
            if(memArray[i] == null){
                memArray[i] = mem;
                break;
            }
        }
        System.out.println("Nie ma miejsca na nowe memy!");
    }

    private void validateAnswer(String answer) {
        switch (answer){
            case "1": {
                addMem();
                break;
            }
            case "2":{
                printMem();
                break;
            }
            default:{
                System.out.println("Nie znam takiej komendy!");
            }
        }
    }

    private void printMem() {
        if(memArray != null){
            for (Mem mem : memArray) {
                System.out.println(mem.toString());
            }
        }else{
            System.out.println("Najpierw zapisz MEMA! :)");
        }
    }

    private void addMem() {
        System.out.println("Podaj dane nowego mema");
        Mem mem = new Mem();

        System.out.print("Podaj nazwę: ");
        mem.setName(scanner.nextLine());

        System.out.print("Podaj opis: ");
        mem.setDescription(scanner.nextLine());

        System.out.print("Lubisz go? (tak/nie): ");
        mem.setFavourite(scanner.nextLine().equalsIgnoreCase("tak"));

        System.out.print("Podaj URL: ");
        String url = scanner.nextLine();

        if(!Pattern.matches("https?://.+", url)){
            System.out.println("Niepoprawny format URL");
            return;
        }
        mem.setUrl(url);
        addMemToArray(mem);
    }
}
