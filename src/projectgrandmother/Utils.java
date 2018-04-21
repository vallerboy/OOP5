package projectgrandmother;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public static String readFileContent(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader fileInputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");

        int read;
        while ((read = fileInputStreamReader.read()) != -1){
             stringBuilder.append((char)read);
        }

        return stringBuilder.toString();
    }
}
