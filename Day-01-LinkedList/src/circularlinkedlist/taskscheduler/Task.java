package circularlinkedlist.taskscheduler;

public class Task {
    // task data
    private String id;
    private String name;
    private int priority;
    private String dueDate;

    // next pointer
    Task next;

    // constructor to assign values
    public Task(String id, String name, int priority, String dueDate){
        this.id=id;
        this.name=name;
        this.priority=priority;
        this.dueDate=dueDate;
        next=null;
    }

    // method to get id
    public String getId() {
        return id;
    }

    // method to get priority of task
    public int getPriority() {
        return priority;
    }

    // method to display task details
    public void getDetails(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("priority: "+priority);
        System.out.println("dueDate: "+dueDate);
        System.out.println();
    }
}
