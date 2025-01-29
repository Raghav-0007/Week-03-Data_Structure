package circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList list=new TaskLinkedList();
        list.addAtBeginning("T001", "Complete Project Report", 1, "2025-02-10");
        list.addAtBeginning("T002", "Attend Team Meeting", 3, "2025-02-05");
        list.addAtEnd("T003", "Submit Assignment", 2, "2025-02-07");
        list.addAtEnd("T004", "Prepare Presentation", 1, "2025-02-12");
        list.addAtEnd("T005", "Code Review", 2, "2025-02-08");
        list.addAtPosition("T006", "Client Call", 3, "2025-02-06", 1);
        list.addAtPosition("T007", "Update Documentation", 2, "2025-02-09", 4);

        list.viewTask();
        list.moveTask();
        list.viewTask();
    }
}
