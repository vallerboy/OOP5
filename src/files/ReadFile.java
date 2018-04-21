package files;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {
    private File mainFile;

    public ReadFile(String pathFile){
       //mainFile = new File(pathFile);
    }

    public String readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(mainFile);
        StringBuilder  stringBuilder = new StringBuilder();

        int read;
        while ((read = fileInputStream.read()) != -1){
            stringBuilder.append((char)read);
        }

        return stringBuilder.toString();
    }

    public int countHrefOnWebsite(String website) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(website).openConnection();
        InputStream inputStream =  httpURLConnection.getInputStream();
        StringBuilder  stringBuilder = new StringBuilder();

        int read;
        while ((read = inputStream.read()) != -1){
            stringBuilder.append((char) read);
        }

        return countsHrefs(stringBuilder);
    }

    private int countsHrefs(StringBuilder stringBuilder) {
        int counter = 0;
        Pattern patternHref = Pattern.compile("href=");
        Matcher matcher = patternHref.matcher(stringBuilder.toString());

        while (matcher.find()){
            counter++;
        }

        return counter;
    }
}