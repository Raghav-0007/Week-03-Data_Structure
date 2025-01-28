package singlylinkedlist.studentrecordmanagement;

public class Student {
    // head node of LL
    Node head;

    // method to check is it empty or not
    public boolean isEmpty(Node node){
        if(node.next==null){
            return true;
        }
        return false;
    }

    // add student record at Beginning
    public void addStudentRecordBeginning(String rollNumber, String name, int age, char grade){
        Node temp=new Node(rollNumber, name, age, grade);

        temp.next=head;
        head=temp;
    }

    // add student record at End
    public void addStudentRecordEnd(String rollNumber, String name, int age, char grade){
        Node temp=new Node(rollNumber, name, age, grade);

        if(isEmpty(head)){
            head=temp;
            return;
        }
        Node temp2=head;

        while (temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=temp;
    }

    // add student record at a specific position
    public void addStudentRecordAt(String rollNumber, String name, int age, char grade, int index){
        Node temp=new Node(rollNumber, name, age, grade);

        Node temp2=head;

        for(int i=1; i<index && temp2!=null; i++){
            temp2=temp2.next;
        }

        if(temp2==null){
            System.out.println("invalid index position");
            return;
        }

        temp.next=temp2.next;
        temp2.next=temp;
    }

    // method to delete a student record
    public void deleteStudent(String rollNumber){
        Node temp=head;

        if(isEmpty(temp)){
            System.out.println("list is empty");
            return;
        }

        if(temp.rollNumber.equals(rollNumber)){
            head=head.next;
            return;
        }

        while (temp.next!=null && !temp.next.rollNumber.equals(rollNumber)){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("invalid student rollNumber");
            return;
        }
        Node p=temp.next;
        temp.next=temp.next.next;
        System.out.println("student with rollNumber "+rollNumber+" has been deleted");
    }

    // method to search student record
    public void searchStudent(String rollNumber){
        Node temp=head;

        while (temp!=null && !temp.rollNumber.equals(rollNumber)){
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("invalid rollNumber");
            return;
        }
        temp.displayRecord();
    }

    // method to update the grade of student
    public void updateGrade(String rollNumber, char newGrade){
        Node temp=head;
        while (temp!=null && !temp.rollNumber.equals(rollNumber)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("invalid rollNumber for the student");
            return;
        }
        temp.setGrade(newGrade);
    }

    // method to display all students
    public void displayStudentRecord(){
        Node temp=head;
        while (temp!=null){
            temp.displayRecord();
            temp=temp.next;
        }
    }
}
