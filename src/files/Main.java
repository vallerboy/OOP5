package files;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile(null);

        try {
            System.out.println(readFile.countHrefOnWebsite("http://oskarpolak.pl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
