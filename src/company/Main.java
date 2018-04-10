package company;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Adam", "Polak", 2300, 18);
        Worker worker1 = new Worker("Jan", "Kowalaski", 5000, 30);
        Worker worker2 = new Worker("Damian", "Kuc", 8000, 50);

        Company company = new Company("Fivarto", "Kraków", 3);

        company.addWorker(worker);
        company.addWorker(worker1);
        company.addWorker(worker2);

        System.out.println(company.getMonthlyPaymentForWorkers());
    }
}
