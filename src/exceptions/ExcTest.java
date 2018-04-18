package exceptions;


import javax.swing.*;
import java.io.IOException;

public class ExcTest {
    public static void main(String[] args) {
        try {
            play();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Przykro mi, nasze serwery są niedostępne");
        }
    }

    //----------------------KOD PONIŻEJ TO KOGOS API (BIBLIOTEKA DLA NAS) ----------------------------
    public static void play() throws IOException{
            divide(5, 0);
    }

    public static int divide(int a, int b) throws IOException {
        if(b == 0){
            throw new IOException("Do not divide by 0");
        }
        return a / b;
    }
}
