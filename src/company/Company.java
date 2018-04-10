package company;

public class Company {
    private String name;
    private String residence;
    private Worker[] workers;

    public Company(String name, String residence, int workerCount) {
        this.name = name;
        this.residence = residence;

        workers = new Worker[workerCount];
    }


    public boolean addWorker(Worker worker){
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] == null){
                workers[i] = worker;
                return true;
            }
        }
        return false;
    }

    public int getMonthlyPaymentForWorkers(){
        int sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum;
    }

    public Worker getWorkerWithHighestSalary(){
        Worker worker = workers[0];
        for (Worker worker1 : workers) {
            if(worker.getSalary() < worker1.getSalary()){
                worker = worker1;
            }
        }
        return worker;
    }

    public String getName() {
        return name;
    }

    public String getResidence() {
        return residence;
    }
}
