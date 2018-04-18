package collections;

public class Task implements Comparable<Task> {

    private int weight;
    private String taskMessage;

    public Task(int weight, String taskMessage) {
        this.weight = weight;
        this.taskMessage = taskMessage;
    }

    public int getWeight() {
        return weight;
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.weight, o.getWeight()) * -1;
    }
}
