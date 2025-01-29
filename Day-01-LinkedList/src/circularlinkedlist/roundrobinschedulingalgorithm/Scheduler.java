package circularlinkedlist.roundrobinschedulingalgorithm;

class Scheduler {
    private Process head = null, tail = null;
    private int timeQuantum;

    public Scheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add a process at the end of the circular list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head; // Circular link
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    // Remove a process by ID
    public void removeProcess(int processID) {
        if (head == null) return;

        Process temp = head, prev = null;
        do {
            if (temp.processID == processID) {
                if (temp == head && temp == tail) { // Only one node
                    head = tail = null;
                } else {
                    if (temp == head) head = head.next;
                    if (temp == tail) tail = prev;
                    if (prev != null) prev.next = temp.next;
                    tail.next = head; // Maintain circular link
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate round-robin execution
    public void executeProcesses() {
        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        int totalProcesses = 0, totalWaitTime = 0, totalTurnaroundTime = 0;
        Process current = head;
        System.out.println("\nExecuting processes in Round-Robin manner (Time Quantum: " + timeQuantum + ")");

        while (head != null) {
            System.out.println("\nCurrent Process List:");
            displayProcesses();

            int executedTime = Math.min(current.burstTime, timeQuantum);
            System.out.println("Executing Process " + current.processID + " for " + executedTime + " units.");
            current.burstTime -= executedTime;

            if (current.burstTime == 0) { // Process completed
                int turnaroundTime = totalWaitTime + executedTime;
                totalProcesses++;
                totalTurnaroundTime += turnaroundTime;
                System.out.println("Process " + current.processID + " completed. Turnaround Time: " + turnaroundTime);
                removeProcess(current.processID);
            } else {
                current = current.next; // Move to the next process
            }

            totalWaitTime += executedTime; // Update wait time for remaining processes
        }

        // Calculate and display average times
        double avgWaitTime = (double) totalWaitTime / totalProcesses;
        double avgTurnaroundTime = (double) totalTurnaroundTime / totalProcesses;
        System.out.println("\nAverage Waiting Time: " + avgWaitTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Display processes in the circular list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

