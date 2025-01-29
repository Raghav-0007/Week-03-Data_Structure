package circularlinkedlist.taskscheduler;

public class TaskLinkedList {
    // Create head and tail
    Task head, tail, track;

    // add task at beginning
    public void addAtBeginning(String id, String name, int priority, String dueDate){
        Task task=new Task(id, name, priority, dueDate);

        if(head==null){
            head=tail=track=task;
            tail.next=head;
            return;
        }
        task.next=head;
        head=task;
        tail.next=head;
    }

    // add at end
    public void addAtEnd(String id, String name, int priority, String dueDate){
        Task task=new Task(id, name, priority, dueDate);

        if(head==null){
            head=tail=track=task;
            tail.next=head;
            return;
        }
        tail.next=task;
        tail=task;
        tail.next=head;
    }

    //add at specific position
    public void addAtPosition(String id, String name, int priority, String dueDate, int index){
        Task task=new Task(id, name, priority, dueDate);

        if(index==1){
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task temp=head;
        for(int i=1; i<index-1; i++){
            if(temp==tail){
                System.out.println("invalid index");
                return;
            }
        }
        task.next=temp.next;
        temp.next=task;
    }

    // remove by task id
    public void removeById(String id){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.getId().equals(id)){
            if(head==track){
                track=track.next;
            }
            tail.next=head.next;
            tail.next=head;
            System.out.println("deleted successfuly!");
            return;
        }
        Task temp=head;
        do{
            if(temp.next.getId().equals(id)){
                if(temp.next==track){
                    track=track.next;
                }
                if(temp.next==tail){
                    temp.next=head;
                    tail=temp;
                }else{
                    temp.next=temp.next.next;
                }
                System.out.println("deleted successfuly!");
                return;
            }
            temp=temp.next;
        }while (temp!=head);
    }

    // method to view current task
    public void viewTask(){
        System.out.println("your current task is.....");
        track.getDetails();
    }

    // method to move the view task
    public void moveTask(){
        track=track.next;
    }

    // search bt priority
    public void searchByPriority(int priority){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Task temp=head;
        do{
            if(temp.getPriority()==priority){
                System.out.println("searched successfuly!");
                temp.getDetails();
                return;
            }
            temp=temp.next;
        }while (temp!=head);
        System.out.println("task not found!");
    }

    // display all tasks
    public void displayTasks(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Task temp=head;
        System.out.println("All the tasks are......");
        do{
            temp.getDetails();
            temp=temp.next;
        }while (temp!=head);
    }
}
