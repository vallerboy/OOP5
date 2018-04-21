package projectgrandmother;

import java.io.IOException;

public class Main {
    //nazwa:ilosc:cena/nazwa:ilosc:cena/nazwa:ilosc:cena
    //Oblicz kwote całkowią zakupów
    //Jakiego produktu kupiła najwiecej
    //Czy nie naliczyli podwojjnie jakiegos towaru, tego nie wliczamy w "czego najwięcej kupiła"
    //5, 2, 1, 0.50, 0.20, 0.10 - i ile najmniej musi miec ze sobą monet aby oplacic zamowienie

    //Jabłka:20:0.50/Mąka:10:5/Jabłka:20:0.50/Masło:2:14.10/Kiełbasa:4:30.60/Jaja:20:0.60/Leki:10:35/Słodycze:40:1.20/Marchew:23:0.80/Galareta:10:2

    public static void main(String[] args) {

        ProductList productList = null;
        try {
             productList = new ProductList("C:\\asd\\zakupy.txt");
        } catch (IOException e) {
            System.out.println("Nie udało załadować się pliku");
            System.exit(1);
            e.printStackTrace();
        }

        System.out.println(productList.getMaxProduct());
        System.out.println(productList.getTotalPrice());
        System.out.println(productList.hasListDoubleProduct());
    }

}
