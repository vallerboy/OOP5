package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Kamila");
        names.add("Adam");
        names.add("Damian");
        names.add("Oskar");

        names.remove("Adam");




        //Struktura LinkedListy
        Node<String> node = new Node<>();
        node.value = "Ala";

        Node<String> node1 = new Node<>();
        node1.value = "Ala2";

        Node<String> node2 = new Node<>();
        node2.value = "Inna wartosc";

        Node<String> node3 = new Node<>();
        node3.value = "JEszcze inna";

        Node<String> node4 = new Node<>();
        node4.value = "JEszcze inna inna inna";

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        /////////////////////

        List<Integer> ages = new LinkedList<>();

        ages.add(20);
        ages.add(30);
        ages.add(40);
        ages.add(50);
        ages.add(60);


        List<Integer> someIntegerList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            someIntegerList.add(0, i);
        }
        long stopoTiime = System.currentTimeMillis();

        System.out.println(stopoTiime - startTime);
    }


    public static void showMe(List<String> someList){
        someList.forEach(System.out::println);
    }
}
