package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueTest{
    public static void main(String[] args) {
        Queue<Task> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Task(3, "Zrób pranie"));
        priorityQueue.add(new Task(5, "Zrób zakupy"));
        priorityQueue.add(new Task(1, "Odbierz dzieci"));
        priorityQueue.add(new Task(9, "Słuchaj uważnie na wykładzie"));
        priorityQueue.add(new Task(10, "Podlej kwiaty"));


        while (priorityQueue.size() > 0){
            System.out.println(priorityQueue.remove().getTaskMessage());
        }

        System.out.println("Wielkość kolejki: " + priorityQueue.size());
    }

    public <T> boolean addToQueue(T task, Queue<T> queue) {
        if(queue.size() > 100) {
            return false;
        }
        queue.add(task);
        return true;
    }
}
