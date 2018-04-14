package generic;

import java.util.Scanner;

public class Box<T extends CharSequence & Comparable> {
    private T[] array;

    //Dynamiczna wielkość
    public Box(int i){
        array = (T[]) new Object[i];
    }

    public void add(T element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                array[i] = element;
                break;
            }
        }
    }

    public void printArray() {
        for (T t : array) {
            System.out.println(t);
        }
    }

}
