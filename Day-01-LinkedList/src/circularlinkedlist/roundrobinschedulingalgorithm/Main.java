package circularlinkedlist.roundrobinschedulingalgorithm;

public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler(3); // Time Quantum = 3

        // Adding processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);

        // Display initial processes
        System.out.println("Initial Process List:");
        scheduler.displayProcesses();

        // Execute round-robin scheduling
        scheduler.executeProcesses();
    }
}

